-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 17, 2025 at 04:29 AM
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
-- Database: `payroll_dbbb`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `UserType` varchar(50) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `your_table_name`
--

CREATE TABLE `your_table_name` (
  `id` int(11) NOT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `UserType` varchar(255) DEFAULT NULL,
  `Username` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `your_table_name`
--

INSERT INTO `your_table_name` (`id`, `FirstName`, `LastName`, `Email`, `UserType`, `Username`, `Password`, `Status`) VALUES
(22, 'FOOD', 'CANDY', 'CANDY@yahoo.com', 'USER', 'CANDY', '4/OkzNqqFuyVddt4x6Tkr8P7i4RdVnAGsimra64Rl7o=', 'Pending'),
(23, 'FLOW', 'WIND', 'WIND@yahoo.com', 'USER', 'WIND', '50KDDW4zPnzuc65gf/eWpnKRLJ4n5UBWCOHQe7l3EjM=', 'Pending'),
(24, 'JOWM', 'jowm', 'jowm@yahoo.com', 'EMPLOYEE', 'jowm', 'nqVgwf+oQ92RdTb56bMw4ky/BYMo9JTUWo4BIeujq7k=', 'Pending'),
(25, 'test', 'test', 'test@yahoo.com', 'USER', 'test12', 'b+wqlgHVs1gclPIVD8B/o9bkWAgHlCg1S4aOQSt25rs=', 'Pending'),
(26, 'kill', 'kill', 'kill@yahoo.com', 'USER', 'yahoo', 'E48q+3Rky/GU5KxHm3Aqs2cclK05xNlmJwWRdHfALPk=', 'Pending'),
(28, 'krypto', 'krypto', 'krypto@gmail.com', 'USER', 'krypto', 'E1Ft8v7vgpibazii7y3FS/TuIncQBVijmHT7ZGqdH+8=', 'ACTIVE'),
(29, 'century', 'century', 'century@gmail.com', 'EMPLOYEE', 'century', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `Username` (`Username`);

--
-- Indexes for table `your_table_name`
--
ALTER TABLE `your_table_name`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `your_table_name`
--
ALTER TABLE `your_table_name`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
