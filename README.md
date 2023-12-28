# Projecte Màquina de Bitllets

## Visió general
Màquina de bitllets és un projecte dins de l'àmbit educatiu, amb un enfocament en la programació modular i la bona documentació del codi. No obstant això, el seu principal objectiu és fomentar la col·laboració, utilitzant Git i GitHub per permetre que diverses persones treballin de manera conjunta en el mateix projecte.

Aqui va el png VisioGeneral

<a id = "toc"></a>
# Índex
1. [Descripció del Projecte](#project-description)
2. [Com instal·lar i executar el projecte](#install)
3. [Execució del Projecte](#execution)
4. [Resum](#summary)

<a id = "project-description"></a>
# Descripció del Projecte
En executar aquesta aplicació, et trobaràs davant d'una màquina de venda de bitllets de tren, com podrien ser de FGC o rodalies. El programa et preguntarà quin tipus de bitllet vols comprar i de quantes zones, en base a això calcularà el preu. T'acceptarà el pagament amb monedes o bitllets de curs legal i, finalment, t'imprimirà un rebut si així ho desitges.

L'aplicació disposa de diversos arxius que treballen simultàniament. Un d'ells és [menus](/src/main/kotlin/menus.kt), centrat en la interacció amb l'usuari. Un arxiu [càlculs](/src/main/kotlin/calculs.kt) que emmagatzema totes les funcions relacionades amb els càlculs. Tenim [utilities](/src/main/kotlin/utilities.kt) i [funcions d'entrada](/src/main/kotlin/funcionsEntrada.kt), dos arxius que allotgen mètodes per a la recollida efectiva de dades de l'usuari. Finalment, hem afegit un arxiu [colors](/src/main/kotlin/colors.kt) que col·labora amb [utilities](/src/main/kotlin/utilities.kt) per donar un toc de color i vida a les impressions per consola. Tot això, evidentment, a part del "Main", el director principal de l'orquestra.

