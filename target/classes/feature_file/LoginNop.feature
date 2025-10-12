@login
Feature: Authentification
  ETQ utilisateur je souhaite me connecter sur le site nopcommerce
  Background:
    Given Je navigue sur le site nopcommerce
    When Je saisis l'adresse mail
    And Je saisis le mot de passe
    And Je clique sur le bouton login in

  @Login-validCredential
   Scenario: Je souhaite me connecter avec des identifiants valides
   Then Je me redirige vers la page Home "Dashboard"

  