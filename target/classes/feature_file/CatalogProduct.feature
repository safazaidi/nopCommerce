@Catalog
Feature: Choisir un produit  
ETQ utilisateur 
Background:
    Given Je navigue sur le site nopcommerce
    When Je saisis l'adresse mail
    And Je saisis le mot de passe
    And Je clique sur le bouton login in
   
  @ChoisirProduct
  Scenario: Je souhaite choisir un produit à partir du catalog
  And Je clique sur le bouton catalog
  And Je clique sur le bouton product dans le menu catalog
  And Je saisie le product name
  And Je choisis à partir de la liste category electronic
  And Je clique sur le bouton search subcategory
  And Je selectionne HP dans le menu manufactorer 
  And Je selectionne vendor1 dans le menu vendor
  And Je selectionne ALL dans le menu warehouse
  And Je selectionne ALL dans le menu Product Type
  And Je selectionne ALL dans le menu Published
  And Je saisie HP_SPX_UB dans Go directly to product SKU
  And Je clique sur le bouton go
  Then Je redirige vers nouvelle page "Edit product details - HP Spectre XT Pro UltraBook  back to product list" 
  
  @AddNewProduct
  Scenario: Je souhaite ajouter un nouveau produit
  And Je clique sur le bouton catalog
  And Je clique sur le bouton product dans le menu catalog
  And Je clique sur le bouton add new product
  And Je redirige vers une nouvelle page
  And Je clique sur le bouton product info
  And Je saisie le product name
  And Je saisie une short description
  And Je saisie full description
  And Je saisie le SKU
  And Je selectionne Electronics dans le menu Categories
  And Je selectionne HP dans le menu Manufactures
  And Je clique sur le bouton Published
  And Je saisie Product tags
  And Je saisie le GTIN
  And Je saisie manufacturer part number
  And Je clique sur le bouton show on home page
  And Je selectionne simple dans le menu product template
   
  


  