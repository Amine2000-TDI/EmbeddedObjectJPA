<h1>Mapper les objets embarqués avec l’api JPA</h1>
<h2>Première commit 1 : </h2>
<h2>Configuration de la Base de Données</h2>
<p>Le fichier persistence.xml configure l'unité de persistance avec Hibernate et MySQL.</p>
<h3>Principales configurations :</h3>
<ul>
    <li><strong>Fournisseur : </strong>org.hibernate.jpa.HibernatePersistenceProvider</li>
<li><strong>URL de connexion : </strong>jdbc:mysql://localhost:3306/embeddedObjectJpa?serverTimezone=UTC</li>
<li><strong>Utilisateur : </strong>root</li>
<li><strong>Mot de passe : </strong>root</li>
<li><strong>Dialecte : </strong>org.hibernate.dialect.MySQL8Dialect</li>
<li><strong>Création de la base :  </strong>hibernate.hbm2ddl.auto = create-drop</li>
</ul>
<h2>Deuxième commit 2 : </h2>
<p>Ce projet utilise Log4j pour la gestion des logs.</p>
<p>Un test basique de Log4j a été effectué dans le fichier Main.java pour vérifier le bon fonctionnement des logs.</p>
<ul>
<li>logger.debug("Ceci est un message de debug");</li>
<li>logger.info("Ceci est un message d'information");</li>
<li>logger.error("Ceci est un message d'erreur");</li>
</ul>
<p>Cela permet de générer différents niveaux de logs (debug, info, erreur) dans le fichier app.log.</p>

