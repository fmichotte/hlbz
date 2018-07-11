CREATE DATABASE  IF NOT EXISTS `hb_student_tracker`;
USE `hb_student_tracker`;

--
-- Table structure for table `technical`
--

DROP TABLE IF EXISTS `technical`;

CREATE TABLE `technical` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `key_param` varchar(45) DEFAULT NULL,
  `key_value` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

