CREATE DATABASE  IF NOT EXISTS `empresa` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `empresa`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: empresa
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `producto_almacen`
--

DROP TABLE IF EXISTS `producto_almacen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `producto_almacen` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `IDPRODUCTO` int(4) NOT NULL,
  `IDALMACEN` int(4) NOT NULL,
  `CANTIDAD` decimal(5,2) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `producto_almacen_ibfk_1` (`IDPRODUCTO`),
  KEY `producto_almacen_ibfk_2` (`IDALMACEN`),
  CONSTRAINT `producto_almacen_ibfk_1` FOREIGN KEY (`IDPRODUCTO`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `producto_almacen_ibfk_2` FOREIGN KEY (`IDALMACEN`) REFERENCES `almacen` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_almacen`
--

LOCK TABLES `producto_almacen` WRITE;
/*!40000 ALTER TABLE `producto_almacen` DISABLE KEYS */;
INSERT INTO `producto_almacen` VALUES (1,1,1,4.00),(2,2,2,3.00),(4,1,2,4.00);
/*!40000 ALTER TABLE `producto_almacen` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-15  8:04:43
