CREATE TABLE IF NOT EXISTS `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pages` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `publication` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

INSERT INTO `book` (`id`, `author`, `category`, `name`, `pages`, `price`, `publication`) VALUES
(1, 'Santosh Kumar', 'Programming', 'Extensive Multithreading', 100, 50, 'Mcgraw Publication'),
(3, 'Suchitra', 'Programming', 'Java', 1000, 200, 'Mcgraw Publication'),
(5, 'Nitesh', 'Computer Programming', 'C++', 1500, 240, 'Rajput Publication');