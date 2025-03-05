CREATE DATABASE   `eventosbd` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `eventosbd`;
-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: eventosdb
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actualizaciones`
--

DROP TABLE IF EXISTS `actualizaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `actualizaciones` (
  `act_id` int NOT NULL AUTO_INCREMENT,
  `eve_id` int DEFAULT NULL,
  `act_tipo_cambio` varchar(255) DEFAULT NULL,
  `act_valor_anterior` text DEFAULT NULL,
  `act_valor_nuevo` text DEFAULT NULL,
  `act_fecha_actualizacion` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`act_id`),
  KEY `eve_id` (`eve_id`),
  CONSTRAINT `actualizaciones_ibfk_1` FOREIGN KEY (`eve_id`) REFERENCES `eventos` (`eve_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actualizaciones`
--

LOCK TABLES `actualizaciones` WRITE;
/*!40000 ALTER TABLE `actualizaciones` DISABLE KEYS */;
INSERT INTO `actualizaciones` VALUES (1,1,'Cambio de ubicación','Centro de Convenciones Viejo','Centro de Convenciones Tech','2025-02-28 13:47:52',NULL),(2,2,'Cambio de fecha','2023-11-24','2023-11-25','2025-02-28 13:47:52');
/*!40000 ALTER TABLE `actualizaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `cat_id` int NOT NULL AUTO_INCREMENT,
  `cat_nombre` varchar(255) DEFAULT NULL,
  `cat_descripcion` text DEFAULT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Desarrollo de Software','Eventos relacionados con programación y desarrollo de software'),(2,'Inteligencia Artificial','Eventos sobre IA y machine learning'),(3,'Ciberseguridad','Eventos sobre seguridad informática y protección de datos');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento_categoria`
--

DROP TABLE IF EXISTS `evento_categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evento_categoria` (
  `eventcat_id` int NOT NULL AUTO_INCREMENT,
  `eve_id` int DEFAULT NULL,
  `cat_id` int DEFAULT NULL,
  PRIMARY KEY (`eventcat_id`),
  UNIQUE KEY `eve_id` (`eve_id`,`cat_id`),
  KEY `cat_id` (`cat_id`),
  CONSTRAINT `evento_categoria_ibfk_1` FOREIGN KEY (`eve_id`) REFERENCES `eventos` (`eve_id`),
  CONSTRAINT `evento_categoria_ibfk_2` FOREIGN KEY (`cat_id`) REFERENCES `categorias` (`cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento_categoria`
--

LOCK TABLES `evento_categoria` WRITE;
/*!40000 ALTER TABLE `evento_categoria` DISABLE KEYS */;
INSERT INTO `evento_categoria` VALUES (1,1,1),(2,1,3),(3,2,2),(4,2,3);
/*!40000 ALTER TABLE `evento_categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventos`
--

DROP TABLE IF EXISTS `eventos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eventos` (
  `eve_id` int NOT NULL AUTO_INCREMENT,
  `fue_id` int DEFAULT NULL,
  `eve_titulo` varchar(255) DEFAULT NULL,
  `eve_descripcion` text DEFAULT NULL,
  `eve_fecha_inicio` timestamp NULL DEFAULT NULL,
  `eve_fecha_fin` timestamp NULL DEFAULT NULL,
  `eve_ubicacion` varchar(255) DEFAULT NULL,
  `eve_enlace` varchar(255) DEFAULT NULL,
  `eve_fecha_creacion` timestamp NULL DEFAULT NULL,
  `eve_fecha_modificacion` timestamp NULL DEFAULT NULL,
  `eve_estado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`eve_id`),
  KEY `fue_id` (`fue_id`),
  CONSTRAINT `eventos_ibfk_1` FOREIGN KEY (`fue_id`) REFERENCES `fuentes` (`fue_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventos`
--

LOCK TABLES `eventos` WRITE;
/*!40000 ALTER TABLE `eventos` DISABLE KEYS */;
INSERT INTO `eventos` VALUES (1,1,'Conferencia de Desarrollo Ágil','Un evento sobre metodologías ágiles en el desarrollo de software.','2025-03-15 19:00:00','2025-03-15 22:00:00','Auditorio A','http://www.evento1.com','2025-02-01 10:00:00','2025-02-01 10:00:00','Activo'),(2,2,'Taller de Inteligencia Artificial','\'Un taller práctico sobre aplicaciones de IA en la industria.','2025-03-20 09:00:00','2025-03-20 18:00:00','Centro de Convenciones','http://www.evento2.com','2025-02-02 11:30:00','2025-02-02 11:30:00','Activo');
/*!40000 ALTER TABLE `eventos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuentes`
--

DROP TABLE IF EXISTS `fuentes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fuentes` (
  `fue_id` int NOT NULL AUTO_INCREMENT,
  `fue_nombre` varchar(255) DEFAULT NULL,
  `fue_url` varchar(255) DEFAULT NULL,
  `fue_tipo` varchar(255) DEFAULT NULL,
  `fue_activo` varchar(255) DEFAULT NULL,
  `fue_parametros_extraccion` varchar(255) DEFAULT NULL,
  `fue_ultimo_escaneo` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`fue_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuentes`
--

LOCK TABLES `fuentes` WRITE;
/*!40000 ALTER TABLE `fuentes` DISABLE KEYS */;
INSERT INTO `fuentes` VALUES (1,'TechCrunch','\'http://techcrunch.com','RSS','1','{\"param1\": \"value1\", \"param2\": \"value2\"}','2025-02-01 12:00:00'),(2,'GitHub Events','http://github.com/events','API','1','{\"api_key\": \"xyz123\", \"timeout\": 30}','2025-02-05 14:00:00');
/*!40000 ALTER TABLE `fuentes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monitoreo`
--

DROP TABLE IF EXISTS `monitoreo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monitoreo` (
  `mon_id` int NOT NULL AUTO_INCREMENT,
  `fue_id` int DEFAULT NULL,
  `mon_fecha_monitoreo` timestamp NULL DEFAULT NULL,
  `mon_estado` varchar(255) DEFAULT NULL,
  `mon_resultado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mon_id`),
  KEY `fue_id` (`fue_id`),
  CONSTRAINT `monitoreo_ibfk_1` FOREIGN KEY (`fue_id`) REFERENCES `fuentes` (`fue_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monitoreo`
--

LOCK TABLES `monitoreo` WRITE;
/*!40000 ALTER TABLE `monitoreo` DISABLE KEYS */;
INSERT INTO `monitoreo` VALUES (1,1,'2025-02-28 08:47:26','Exitoso','{\"eventos\": 3}'),(2,2,'2025-02-28 08:47:26','Exitoso','{\"eventos\": 2}');
/*!40000 ALTER TABLE `monitoreo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notificaciones`
--

DROP TABLE IF EXISTS `notificaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notificaciones` (
  `not_id` int NOT NULL AUTO_INCREMENT,
  `eve_id` int DEFAULT NULL,
  `usu_id` int DEFAULT NULL,
  `not_tipo` varchar(255) DEFAULT NULL,
  `not_contenido` text DEFAULT NULL,
  `not_fecha_envio` timestamp NULL DEFAULT NULL,
  `not_leida` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`not_id`),
  KEY `eve_id` (`eve_id`),
  KEY `usu_id` (`usu_id`),
  CONSTRAINT `notificaciones_ibfk_1` FOREIGN KEY (`eve_id`) REFERENCES `eventos` (`eve_id`),
  CONSTRAINT `notificaciones_ibfk_2` FOREIGN KEY (`usu_id`) REFERENCES `usuarios` (`usu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notificaciones`
--

LOCK TABLES `notificaciones` WRITE;
/*!40000 ALTER TABLE `notificaciones` DISABLE KEYS */;
INSERT INTO `notificaciones` VALUES (1,1,1,'email','Recordatorio: Conferencia de Desarrollo Ágil comienza pronto.','2025-02-28 08:47:00','0'),(2,2,2,'sms','Recordatorio: Taller de Inteligencia Artificial mañana.','2025-02-28 08:47:00','0');
/*!40000 ALTER TABLE `notificaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscripciones`
--

DROP TABLE IF EXISTS `subscripciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subscripciones` (
  `sub_id` int NOT NULL AUTO_INCREMENT,
  `usu_id` int DEFAULT NULL,
  `sub_tipo_notificacion` varchar(255) DEFAULT NULL,
  `sub_activo` boolean DEFAULT NULL,
  PRIMARY KEY (`sub_id`),
  KEY `usu_id` (`usu_id`),
  CONSTRAINT `subscripciones_ibfk_1` FOREIGN KEY (`usu_id`) REFERENCES `usuarios` (`usu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscripciones`
--

LOCK TABLES `subscripciones` WRITE;
/*!40000 ALTER TABLE `subscripciones` DISABLE KEYS */;
INSERT INTO `subscripciones` VALUES (1,1,'email','1'),(2,2,'sms','1');
/*!40000 ALTER TABLE `subscripciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `usu_id` int NOT NULL AUTO_INCREMENT,
  `usu_nombre` varchar(255) DEFAULT NULL,
  `usu_email` varchar(255) DEFAULT NULL,
  `usu_preferencias_notificacion` JSON DEFAULT NULL,
  `usu_fecha_registro` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`usu_id`),
  UNIQUE KEY `usu_email` (`usu_email`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Carlos Gomes','carlos@example.com','{\"sms\": false, \"email\": true}','2025-02-28 08:46:05'),(2,'Ana Torres','ana@example.com','{\"sms\": true, \"email\": true}','2025-02-28 08:46:05'),(13,'Anita Torres','anita@example.com','{\"sms\": true, \"email\": true}','2025-03-04 08:46:44'),(15,'Anitou Torres','anito@example.com','{\"sms\": true, \"email\": true}','2025-03-04 08:49:42');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `before_insert_usuario` BEFORE INSERT ON `usuarios` FOR EACH ROW BEGIN
    -- Si el valor de usu_fecha_registro es NULL, asignar la fecha y hora actuales
    IF NEW.usu_fecha_registro IS NULL THEN
        SET NEW.usu_fecha_registro = NOW();
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `before_update_usuario` BEFORE UPDATE ON `usuarios` FOR EACH ROW BEGIN
    -- Si el nuevo valor de usu_fecha_registro es NULL, mantener el valor actual
    IF NEW.usu_fecha_registro IS NULL THEN
        SET NEW.usu_fecha_registro = OLD.usu_fecha_registro;
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'eventosdb'
--

--
-- Dumping routines for database 'eventosdb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-05 10:04:55
