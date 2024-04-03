<h1>Compte rendu du TP Inversion de Controle & Injection des Dependances</h1>

<p>Dans cet extrait de code, nous avons mis la main sur la creation statique et dynamiaue des pbjets en Java.
La creation statique repose sur le principe de couplage fort, tandis que la creation dynamique, se basant sur les interfaces et non les classes, repose sur le principe de couplage faible.
Puis apres, nous avons utilise le Framework SPRING, afin de faciliter le travail, et ceci en utilisant le fchier XML, ou directement les annotations dans notre code.
</p>

<h3>Structure du projet</h3>
<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/fd50cb1c-dfdc-4122-892f-c507258fee3a">

<h5>La couche DAO</h5>
<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/7ea4ee0f-1084-4730-af6e-a7b9149f6a20">
<p>Une premiere implementation de l'interface IDao en utilisant la version base de donnees</p>

<br>

<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/3c58ec6e-d5b9-4ccb-96cd-60f3786dde48">
<p>Une deuxieme implementation del'interface en utilisant la version web services.</p>

<br>

<h5>La couche Metier</h5>
<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/270ca292-9fd1-4acd-8773-fb557f033522">
<p>Une implementation de l'interface IMetier</p>

<h5>La couche Presentation</h5>
<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/2da92ef0-04aa-4d19-91f2-0416a1285b1a">
<p>Creation des objets statiquement</p>

<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/9d7fecd6-035b-46fe-be7f-8b2a684b5e13">
<p>Creation des objets dynamiquement</p>
<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/26a1afed-ff2e-4f3a-8b68-01da2cc29165">
<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/78fed57f-af5c-4b1a-8642-e9cc1d11d0a5">
<p>En utilisant un fichier XML</p>

<img src="https://github.com/Thami0011/JEE-ClassWork/assets/115365291/10d35de9-3113-419f-8cc7-09ca4d824ab8">
<p>En utilisant les annotations</p>
