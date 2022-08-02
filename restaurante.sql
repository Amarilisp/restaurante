-- MySQL dump 10.19  Distrib 10.3.34-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: restaurante
-- ------------------------------------------------------
-- Server version	10.3.34-MariaDB-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos` (
  `idpedido` int(11) NOT NULL AUTO_INCREMENT,
  `nro_mesa` int(11) DEFAULT NULL,
  `atendente` varchar(45) DEFAULT NULL,
  `inicio_pedido` datetime DEFAULT NULL,
  `anotacoes_cliente` varchar(120) DEFAULT NULL,
  `anotacoes_restaurante` varchar(120) DEFAULT NULL,
  `pedido_encerrado` datetime DEFAULT NULL,
  PRIMARY KEY (`idpedido`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,11,NULL,NULL,NULL,NULL,NULL),(2,11,NULL,NULL,NULL,NULL,NULL),(3,11,NULL,NULL,NULL,NULL,NULL),(4,11,NULL,NULL,NULL,NULL,NULL),(5,11,NULL,NULL,NULL,NULL,NULL),(6,11,NULL,NULL,NULL,NULL,NULL),(7,11,NULL,NULL,NULL,NULL,NULL),(8,11,NULL,NULL,NULL,NULL,NULL),(9,11,NULL,NULL,NULL,NULL,NULL),(10,11,NULL,NULL,NULL,NULL,NULL),(11,11,NULL,NULL,NULL,NULL,NULL),(12,11,NULL,NULL,NULL,NULL,NULL),(13,11,NULL,NULL,NULL,NULL,NULL),(14,11,NULL,NULL,NULL,NULL,NULL),(15,11,NULL,NULL,NULL,NULL,NULL),(16,11,NULL,NULL,NULL,NULL,NULL),(17,11,NULL,NULL,NULL,NULL,NULL),(18,11,NULL,NULL,NULL,NULL,NULL),(19,11,NULL,NULL,NULL,NULL,NULL),(20,11,NULL,NULL,NULL,NULL,NULL),(21,11,NULL,NULL,NULL,NULL,NULL),(22,11,NULL,NULL,NULL,NULL,NULL),(23,11,NULL,NULL,NULL,NULL,NULL),(24,11,NULL,NULL,NULL,NULL,NULL),(25,11,NULL,NULL,NULL,NULL,NULL),(26,11,NULL,NULL,NULL,NULL,NULL),(27,11,NULL,NULL,NULL,NULL,NULL),(28,11,NULL,NULL,NULL,NULL,NULL),(29,11,NULL,NULL,NULL,NULL,NULL),(30,11,NULL,NULL,NULL,NULL,NULL),(31,11,NULL,NULL,NULL,NULL,NULL),(32,11,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos_produtos`
--

DROP TABLE IF EXISTS `pedidos_produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos_produtos` (
  `id_pedido_produto` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `id_pedido` int(11) DEFAULT NULL,
  `id_produto` int(11) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `nome_produto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_pedido_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos_produtos`
--

LOCK TABLES `pedidos_produtos` WRITE;
/*!40000 ALTER TABLE `pedidos_produtos` DISABLE KEYS */;
INSERT INTO `pedidos_produtos` VALUES (1551,2,19,NULL,23.5,'salada ultra'),(1552,2,19,NULL,15.5,'salada fraca'),(1645,1,22,NULL,15.5,'salada fraca'),(1740,3,25,NULL,5.5,'uma milanesa'),(1741,1,25,NULL,6,'um macarrao'),(1799,1,27,NULL,23.5,'salada ultra'),(1800,3,27,NULL,15.5,'salada fraca'),(1861,1,29,NULL,23.5,'salada ultra'),(1896,1,30,NULL,6,'macarrao'),(1956,2,32,NULL,10,'tomate gostoso'),(1957,1,32,NULL,5.5,'milanesa parmesana'),(1958,3,32,NULL,6,'macarrao');
/*!40000 ALTER TABLE `pedidos_produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produtos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `nome_produto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (1,'uma salada com tudo que vc pensa',23.5,'salada ultra'),(2,'uma salada com pouca coisa',15.5,'salada fraca'),(3,'tomate com maionese',10,'tomate gostoso'),(4,'milanesa parmesana',5.5,'milanesa parmesana'),(5,'um macarrao',6,'macarrao');
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-01 23:28:13
