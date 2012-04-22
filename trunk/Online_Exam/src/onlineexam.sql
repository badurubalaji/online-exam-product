/*
SQLyog v4.06 RC1
Host - 5.5.22 : Database - onlineexam
*********************************************************************
Server version : 5.5.22
*/


create database if not exists `onlineexam`;

USE `onlineexam`;

/*Table structure for table `admin` */

drop table if exists `admin`;

CREATE TABLE `admin` (
  `admin_id` int(25) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(50) DEFAULT NULL,
  `admin_passwod` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

/*Table structure for table `question` */

drop table if exists `question`;

CREATE TABLE `question` (
  `question_id` int(25) NOT NULL AUTO_INCREMENT,
  `question_text` varchar(256) DEFAULT NULL,
  `option1` varchar(50) DEFAULT NULL,
  `option2` varchar(50) DEFAULT NULL,
  `option3` varchar(50) DEFAULT NULL,
  `option4` varchar(50) DEFAULT NULL,
  `option5` varchar(50) DEFAULT NULL,
  `correptions` varchar(50) DEFAULT NULL,
  `subject` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `question` */

/*Table structure for table `student` */

drop table if exists `student`;

CREATE TABLE `student` (
  `student_id` int(25) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(50) DEFAULT NULL,
  `student_password` varchar(50) DEFAULT NULL,
  `student_email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student` */

/*Table structure for table `test` */

drop table if exists `test`;

CREATE TABLE `test` (
  `test_id` int(25) NOT NULL AUTO_INCREMENT,
  `test_subject` varchar(50) DEFAULT NULL,
  `test_no_of_questions` int(25) DEFAULT NULL,
  `test_duration` varchar(50) DEFAULT NULL,
  `test_price` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`test_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `test` */

/*Table structure for table `test_questions` */

drop table if exists `test_questions`;

CREATE TABLE `test_questions` (
  `test_id` int(25) NOT NULL AUTO_INCREMENT,
  `question_id` int(25) DEFAULT NULL,
  PRIMARY KEY (`test_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `test_questions` */

/*Table structure for table `vendor` */

drop table if exists `vendor`;

CREATE TABLE `vendor` (
  `vendor_id` int(25) NOT NULL AUTO_INCREMENT,
  `vendor_name` varchar(50) DEFAULT NULL,
  `vendor_email` varchar(50) DEFAULT NULL,
  `vendor_activate` varchar(50) DEFAULT NULL,
  `vendor_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`vendor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vendor` */

/*Table structure for table `vendor_test` */

drop table if exists `vendor_test`;

CREATE TABLE `vendor_test` (
  `vendor_id` int(25) NOT NULL AUTO_INCREMENT,
  `test_id` int(25) NOT NULL DEFAULT '0',
  `student_id` int(25) NOT NULL DEFAULT '0',
  `purchase_date` date DEFAULT NULL,
  `assign_date` date DEFAULT NULL,
  `written_date` date DEFAULT NULL,
  `result` int(25) DEFAULT NULL,
  PRIMARY KEY (`vendor_id`,`test_id`,`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vendor_test` */
