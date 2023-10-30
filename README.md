# Yasmine-sINF4067
Bonjour/Bonsoir et bienvenue dans mon repository. Il s'agit d'implémenter ici des patrons de design, qui sont des manières d'agencer les données et classes de manière optimale.
Dans ce repository, nous avons les patrons_de_construction et les patrons_de_structuration, distingués.

Les patrons de construction que sont "abstract_factory", "factory", "factory_method", "singleton", "builder" sont ceux qui permettent l'organisation de la création des objets.

Les patrons de structuration, quant à eux, utilisent beaucoup la notion d'interface et ont l’objectif de faciliter l’indépendance de l’interface d’un objet ou d’un ensemble d’objets vis-à-vis de son implémentation. 

Dans ce repository, chaque patron a son implémentation originelle telle que dans le cours, la version modifiée selon le professeur et son pdf en question.

- LES PATRONS DE CONSTRUCTION -

***  FACTORY_METHOD ***
Dans sa version originelle, on a deux produits A1 et A2 héritant de la classe ProduitA (contenant la méthode de crétaion) et étant instanciés par une fabrique abstraite.
Dans les modifications, on y ajoute un troisième produit A3 du même type ProduitA.

*** FACTORY ***
Dans la version originelle, on a deux fabriques concrètes qui héritent du'une fabrique abstraite et instancient chacune un type de produit.
Dans la modification, on y ajoute un troisième élément ProduitA3 qui hérite de ProduitA et qui entraînera la création d'une troisième fabrique concrète.

*** ABSTRACT_FACTORY ***
Dans la version originelle, c'est pareil que Factory mais c'est juste que c'est regroupé en familles et en plus du ProduitA, on a le ProduitB et ses éléments ProduitB1 et ProduitB2.
Dans la modification, on ajoute une troisième famille et donc une troisième fabrique qui entraîne Produit A3 et ProduitB3.

*** SINGLETON ***
Dans la version originelle, on a notre singleton qui ne génère qu'un seul objet.
Dans la modification, on change "singleton" en "arithmétique" car on a ajouté des fonctions telles que somme, soustract, multiplication, moyenne.

*** BUILDER ***
Dans la version originelle, on a un directeur, un monteur abstrait et un concrèt pour pouvoir créer soit une pizza reine soit une piquante. Le monteur concrt hérite de l'abstrait et de ses méthodes de crétaions et y ajoute getProduit().
Dans la modification, on ajoute la pizza "locale" et ses identifiants, et on implémente avec les classes Directeur et Client.

Ainsi s'achève le travail sur les patrons de construction.


- LES PATRONS DE STRUCTURATION -

*** ADAPTER ***
Dans la version originelle,la classe Adaptateur hérite de Dlist et n'implique donc aucun objet lors de la définition des méthodes pop(), top() et getTail(). 
Dans la modification, Adaptateur et DList sont liés par une association ayant pour rôle dList qui sera un attribut de type Dlist cjez Adaptateur. Cela implique de pointer dList dans la redéfinition des méthodes.

*** COMPOSITE ***
