/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import DBconnect.config;
import Model.users;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Workdev
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
@MultipartConfig(
  fileSizeThreshold = 1024 * 1024 * 1, // 1 Mo
  maxFileSize = 1024 * 1024 * 10,      // 10 Mo
  maxRequestSize = 1024 * 1024 * 100   // 100 Mo
)

public class login extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        
        
        Connection con = config.connect();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String typeUser = request.getParameter("typeUser");
        try {
            if (users.checklogin(username, password, (typeUser = "Admin"), con) == true) {
                if (typeUser.equals("Admin")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("username", username);
                    response.sendRedirect("newjsp.jsp");
                    /*request.getRequestDispatcher("dashnew.jsp").forward(request, response);*/
                }

            } else if (users.checklogin(username, password, (typeUser = "Utilisateur simple"), con) == true) {
                if (typeUser.equals("Utilisateur simple")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("username", username);
                    Cookie[] cookies = request.getCookies();
                    if (cookies != null) {
                      for (Cookie cookie : cookies) {
                        if (cookie.getName().equals("username")) {
                          String cookieValue = cookie.getValue();
                          // Stockage de la valeur du cookie dans un attribut de requête
                          request.setAttribute("inputValue", cookieValue);
                          break;
                        }
                      }
                    }
                    response.sendRedirect("boardSuivi_copy.jsp");
                    /*request.getRequestDispatcher("boardSuivi.jsp").forward(request, response);*/
                    
                }
            } else {
                // Si les informations sont invalides, rediriger vers la page de connexion avec un message d'erreur
                HttpSession session = request.getSession();
                session.setAttribute("erreurMessage", "Nom d'utilisateur ou mot de passe invalide.");
                response.sendRedirect("index.jsp");
            }
        } catch (IOException e) {
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("ok");
  
    }

    
    
public static String generateInitialImage(String name) {
    String[] words = name.split("\\s+"); // Diviser le nom en mots en utilisant l'espace comme délimiteur
    StringBuilder initials = new StringBuilder();

    for (String word : words) {
        if (!word.isEmpty()) {
            initials.append(Character.toUpperCase(word.charAt(0)));
        }
    }

    return initials.toString();
}

public static void generateInitialImageFile(String name, String initials, String filePath) {
    int imageSize = 200; // Taille de l'image en pixels
    
    
    // Créer une image BufferedImage
    BufferedImage image = new BufferedImage(imageSize, imageSize, BufferedImage.TYPE_INT_RGB);
    Graphics2D g2d = image.createGraphics();

    // Générer une couleur aléatoire pour l'arrière-plan
    Random random = new Random();
    int red = random.nextInt(256);
    int green = random.nextInt(256);
    int blue = random.nextInt(256);
    Color randomColor = new Color(red, green, blue);
    g2d.setColor(randomColor);
    g2d.fillRect(0, 0, imageSize, imageSize);


    // Dessiner les initiales au centre de l'image
    g2d.setColor(Color.WHITE);
    g2d.setFont(new Font("Arial", Font.BOLD, 100));
    FontMetrics fm = g2d.getFontMetrics();
    int x = (imageSize - fm.stringWidth(initials)) / 2;
    int y = (imageSize - fm.getHeight()) / 2 + fm.getAscent();
    g2d.drawString(initials, x, y);

    // Enregistrer l'image dans un fichier avec gestion des conflits d'initiales
    try {
        String fileName = initials + ".jpg";
        File file = new File(filePath, fileName);
        if (file.exists()) {
            // Le fichier existe déjà, pas besoin de créer une nouvelle image
            return;
        }
            ImageIO.write(image, "jpg", file);
        } catch (Exception e) {
            e.printStackTrace();
        }

    // Libérer les ressources graphiques
    g2d.dispose();
}
    
    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    // Chemin de téléchargement
    String uploadPath = "C:\\Users\\Workdev\\Documents\\NetBeansProjects\\boardsuivisite_-_Copie\\boardsuivisite - Copie\\web\\image\\";

    // Récupérer la partie du fichier
    Part filePart = request.getPart("file");
    String fileName = filePart.getSubmittedFileName();

    // Si aucun fichier n'a été sélectionné, utiliser l'initiale du nom de l'utilisateur
    if (fileName.isEmpty()) {
        String username = request.getParameter("username");
        String initials = generateInitialImage(username);

        fileName = initials + ".jpg"; // Exemple : initiales du nom + ".jpg"
        // Écrire l'image dans le chemin de téléchargement
        generateInitialImageFile(username, initials, uploadPath );

    } else {
        // Écrire le fichier dans le chemin de téléchargement
        filePart.write(uploadPath + fileName);
    }

    Connection cn = config.connect();

    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String confpassword = request.getParameter("confpassword");
    String typeUser = request.getParameter("typeUser");
    String nomComplet = request.getParameter("nomComplet");
    String Telephone = request.getParameter("Telephone");
    String Adresse = request.getParameter("Adresse");
    HttpSession session = request.getSession();
    try {
        users existingUser = new users("", username, email, "", "", "", "", "", "");
        if (existingUser.existsInDatabase(cn)) {
            session.setAttribute("erreurMessage", "Le nom d'utilisateur ou l'adresse e-mail existe déjà.");
            response.sendRedirect("register.jsp");
        } else if (!confpassword.equals(password) || username.isEmpty() || password.isEmpty() || confpassword.isEmpty() || typeUser.isEmpty() || nomComplet.isEmpty() || Telephone.isEmpty() || Adresse.isEmpty()) {
            session.setAttribute("erreur", 1);
            response.sendRedirect("register.jsp");
        } else {
            session.setAttribute("erreur", 0);
            users.Insertion(username, email, password, fileName, typeUser, nomComplet, Telephone, Adresse, cn);
            response.sendRedirect("userlist.jsp");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
