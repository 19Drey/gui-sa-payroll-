-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 05, 2025 at 05:19 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `payroll_dbb`
--

-- --------------------------------------------------------

--
-- Table structure for table `your_table_name`
--

CREATE TABLE `your_table_name` (
  `FirstName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `UserType` varchar(50) DEFAULT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL,
  `id` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `your_table_name`
--

INSERT INTO `your_table_name` (`FirstName`, `LastName`, `Email`, `UserType`, `Username`, `Password`, `Status`, `id`) VALUES
('test', 'test', 'andreestrera20@gmail.com', 'USER', 'Andre', 'Estrera', 'Pending', 1),
('testss', 'testss', 'a@gmail.com', 'ADMIN', 'Andreeee', 'Estrera', 'Pending', 2),
('Hakdog', 'Hakdog', '1@gmail.com', 'USER', 'Hakdog', 'Hakdog', 'Pending', NULL),
('testss', 'testttss', 'utot@gmail.com', 'EMPLOYEE', 'otoy12', 'otoy13', 'Pending', 3),
('qwerty', 'qwerty', 'qwe@gmail.com', 'ADMIN', 'qwerty1', 'qwerty2', 'Pending', 4),
('testss', 'testsss', 'tesss', 'USER', 'test', 'test11', 'Pending', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `your_table_name`
--
ALTER TABLE `your_table_name`
  ADD PRIMARY KEY (`Username`),
  ADD UNIQUE KEY `Email` (`Email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
