-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mer 26 Août 2020 à 09:55
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bddcinema`
--

-- --------------------------------------------------------

--
-- Structure de la table `acteur`
--

CREATE TABLE `acteur` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `acteur`
--

INSERT INTO `acteur` (`id`, `nom`, `prenom`) VALUES
(1, 'GLOVER', 'Donald'),
(2, 'SETH', 'Rogen'),
(3, 'REYNOLDS', 'Ryan'),
(4, 'BACCARIN', 'Morena'),
(5, 'DAMON', 'Matt'),
(6, 'JOHANSSON', 'Scarlett'),
(7, 'HEMSWORTH', 'Chris');

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `categorie`
--

INSERT INTO `categorie` (`id`, `name`) VALUES
(1, 'Aventure'),
(2, 'Action'),
(3, 'Animation'),
(4, 'Fantastique'),
(5, 'Comédie');

-- --------------------------------------------------------

--
-- Structure de la table `cinema`
--

CREATE TABLE `cinema` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `nombre_salle` int(11) NOT NULL,
  `ville_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `cinema`
--

INSERT INTO `cinema` (`id`, `nom`, `nombre_salle`, `ville_id`) VALUES
(1, 'LE GAUMONT', 4, 1),
(2, 'LE COLOMBIER', 3, 1),
(3, 'LE CONCORDE', 4, 2),
(4, 'UTOPIA', 2, 3),
(5, 'PATHÉ', 3, 4),
(6, 'GAUMONT PARNASSE', 2, 5),
(7, 'LE MULTIPLEXE', 6, 2),
(8, 'LE CINEMATOGRAPHE', 1, 2),
(9, 'UGC MONTPARNASSE', 3, 3),
(10, 'LE MÉLIES', 3, 4),
(11, 'LE DIAGONAL-CAPITOLE', 2, 5);

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

CREATE TABLE `film` (
  `id` int(11) NOT NULL,
  `title` varchar(50) DEFAULT NULL,
  `description` varchar(600) DEFAULT NULL,
  `duration` time DEFAULT NULL,
  `releaseyear` varchar(20) DEFAULT NULL,
  `poster` varchar(255) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `language_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `film`
--

INSERT INTO `film` (`id`, `title`, `description`, `duration`, `releaseyear`, `poster`, `category_id`, `language_id`) VALUES
(1, 'Le Roi Lion', 'Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place.', '01:59:00', '2019', 'https://fr.web.img6.acsta.net/medias/nmedia/18/85/97/82/19858447.jpg', 3, 1),
(2, 'Deadpool', 'Deadpool est un mercenaire défiguré doté d\'une capacité surhumaine de guérison accélérée et capable de prouesses physiques. C\'est aussi un mercenaire à la "grande bouche " en raison de sa tendance à discuter et plaisanter constamment.', '01:48:00', '2016', 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcT_GDz-2Xb-Z8XubX6Q_SXlNnS_KRQ78cfTlpQCI6DtH_bEtjwd', 2, 2),
(3, 'La mémoire dans la peau', 'Un agent secret amnésique se rend compte qu\'il sait bien se défendre sans savoir l\'origine de sa force.', '01:59:00', '2002', 'https://musicimage.xboxlive.com/catalog/video.movie.8D6KGWZL5HLV/image?locale=fr-fr&mode=crop&purposes=BoxArt&q=90&h=225&w=150&format=jpg', 2, 1),
(4, 'Aladdin', 'Comment Aladdin, grâce à la félonie du grand vizir, va se procurer la lampe magique qui héberge le fameux génie et nous entrainer dans la plus étonnante des aventures.', '01:30:00', '1992', 'https://fr.web.img5.acsta.net/pictures/16/06/06/09/31/004115.jpg', 3, 1),
(5, 'Docteur Strange', 'Docteur Strange est un Maître des arts mystiques auquel tous les autres super-héros font appel quand ils ont affaire à des adversaires utilisant des pouvoirs occultes.', '01:55:00', '2016', 'https://ninehank.com/wp-content/uploads/014-405x600.jpg', 2, 2),
(6, 'Le Voyage de Chihiro', 'Chihiro, une fillette capricieuse, s\'apprête à emménager avec ses parents dans une nouvelle demeure. La petite famille se retrouve bientôt dans une ville fantôme et les parents se transforment en cochons. Chihiro va tenter de leur porter secours.', '02:05:00', '2001', 'https://www.studioghibli.fr/wp-content/uploads/2019/06/chihiro-vchine.jpg', 3, 3),
(7, 'Inception', 'Dom Cobb est un voleur expérimenté dans l\'appropriation des secrets les plus précieux d\'un individu, \r\nenfouis au plus profond de son subconscient, pendant qu\'il rêve et que son esprit est\r\n particulièrement vulnérable.', '02:42:00', '2010', 'https://i.ebayimg.com/images/g/bdEAAOSwnK9ZXRyy/s-l300.jpg', 2, 1),
(8, 'Que justice soit faite', 'Dix ans après le meurtre de sa femme et sa fille, un homme se dresse contre le procureur en charge du procès des meurtriers, pour obtenir lui-même la justice. Sa vengeance menace tout aussi bien l\'homme qui leur a accordé la clémence, que le système et la ville elle-même.', '00:58:00', '2010', 'https://fr.web.img6.acsta.net/medias/nmedia/18/72/55/36/19593496.jpg', 2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `film_acteurs`
--

CREATE TABLE `film_acteurs` (
  `film_id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `film_acteurs`
--

INSERT INTO `film_acteurs` (`film_id`, `acteurs_id`) VALUES
(1, 1),
(2, 1),
(2, 3),
(2, 4),
(3, 5),
(1, 6),
(1, 7);

-- --------------------------------------------------------

--
-- Structure de la table `language`
--

CREATE TABLE `language` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `language`
--

INSERT INTO `language` (`id`, `name`) VALUES
(1, 'Anglais'),
(2, 'Français'),
(3, 'Espagnol'),
(4, 'Italien');

-- --------------------------------------------------------

--
-- Structure de la table `place`
--

CREATE TABLE `place` (
  `id` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `salle_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `place`
--

INSERT INTO `place` (`id`, `numero`, `salle_id`) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 1),
(4, 4, 1),
(5, 5, 1),
(6, 6, 2),
(7, 7, 2),
(8, 8, 2),
(9, 9, 2),
(10, 10, 2),
(11, 11, 2),
(12, 12, 2),
(13, 13, 2),
(14, 14, 2),
(15, 15, 3),
(16, 16, 3),
(17, 17, 3),
(18, 18, 3),
(19, 19, 3),
(20, 20, 3),
(21, 21, 3),
(22, 22, 3),
(23, 23, 3),
(24, 24, 4),
(25, 25, 4),
(26, 26, 4),
(27, 27, 4),
(28, 28, 4),
(29, 29, 4),
(30, 30, 5),
(31, 31, 5),
(32, 32, 5),
(33, 33, 5),
(34, 34, 5),
(35, 35, 5),
(36, 36, 6),
(37, 37, 6),
(38, 38, 6),
(39, 39, 6),
(40, 40, 6),
(41, 41, 6),
(42, 42, 7),
(43, 43, 7),
(44, 44, 7),
(45, 44, 7),
(46, 45, 7),
(47, 46, 7),
(48, 47, 8),
(49, 48, 8),
(50, 49, 8),
(51, 50, 8),
(52, 51, 8),
(53, 52, 8),
(54, 53, 9),
(55, 54, 9),
(56, 55, 9),
(57, 56, 9),
(58, 57, 9),
(59, 58, 9),
(60, 59, 10),
(61, 60, 10),
(62, 61, 10),
(63, 62, 10),
(64, 63, 10),
(65, 64, 10);

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `id` int(11) NOT NULL,
  `code_achat` int(11) NOT NULL,
  `prix` double NOT NULL,
  `date_reservation` datetime DEFAULT NULL,
  `nom_client` varchar(100) DEFAULT NULL,
  `place_reservee` bit(1) NOT NULL,
  `place_id` int(11) DEFAULT NULL,
  `seance_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `reservation`
--

INSERT INTO `reservation` (`id`, `code_achat`, `prix`, `date_reservation`, `nom_client`, `place_reservee`, `place_id`, `seance_id`) VALUES
(1, 612, 7.5, '2020-06-24 11:36:00', 'Gerald', b'1', 1, 1),
(2, 612, 8.5, '2020-06-30 15:42:00', 'Gerald', b'1', 2, 2),
(3, 612, 10, '2020-06-16 14:12:00', 'Gerald', b'1', 7, 4),
(4, 0, 7.45, '2020-07-07 16:14:00', NULL, b'0', 5, 1),
(5, 68, 5.45, '2020-06-03 08:46:00', 'laurent', b'1', 15, 5),
(6, 68, 5.45, '2020-08-28 13:00:00', 'laurent', b'1', 24, 7),
(7, 68, 4.5, '2020-09-17 12:00:00', 'laurent', b'1', 3, 2),
(8, 0, 9.99, '2020-09-22 14:13:00', NULL, b'0', 9, 3),
(9, 0, 10.45, '2020-10-12 16:22:00', NULL, b'0', 15, 5),
(10, 0, 4.55, '2020-08-29 16:30:00', NULL, b'0', 11, 3),
(11, 0, 6.5, '2020-09-29 14:40:00', NULL, b'0', 28, 6),
(12, 0, 7.5, '2020-09-07 14:28:00', NULL, b'0', 7, 4),
(13, 0, 12, '2020-09-30 19:15:00', NULL, b'0', 38, 10),
(14, 0, 6.5, '2020-10-08 16:23:00', NULL, b'0', 12, 3),
(15, 0, 4.5, '2020-09-17 14:30:00', NULL, b'0', 14, 4);

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE `salle` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `capacite` int(11) NOT NULL,
  `cinema_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `salle`
--

INSERT INTO `salle` (`id`, `nom`, `capacite`, `cinema_id`) VALUES
(1, 'Salle 1', 125, 1),
(2, 'Salle 2', 255, 1),
(3, 'Salle 3', 456, 1),
(4, 'Salle 4', 620, 2),
(5, 'Salle 5', 410, 2),
(6, 'Salle 6', 85, 3),
(7, 'Salle 7', 100, 3),
(8, 'Salle 8', 115, 4),
(9, 'Salle 9', 99, 5),
(10, 'Salle 10', 50, 6),
(11, 'Salle 11', 120, 1),
(12, 'Salle 12', 57, 2),
(13, 'Salle 13', 145, 7),
(14, 'Salle 14', 150, 7),
(15, 'Salle 15', 142, 7),
(16, 'Salle 16', 94, 7),
(17, 'Salle 17', 105, 7),
(18, 'Salle 18', 345, 7),
(20, 'Salle 20', 120, 8),
(21, 'Salle 21', 78, 4),
(22, 'Salle 22', 214, 9),
(23, 'Salle 23', 98, 9),
(24, 'Salle 24', 89, 9),
(25, 'Salle 25', 102, 5),
(26, 'Salle 26', 102, 5),
(27, 'Salle 27', 109, 10),
(28, 'Salle 28', 97, 10),
(29, 'Salle 29', 78, 10),
(30, 'Salle 30', 65, 6),
(31, 'Salle 31', 142, 11),
(32, 'Salle 32', 79, 11);

-- --------------------------------------------------------

--
-- Structure de la table `seance`
--

CREATE TABLE `seance` (
  `id` int(11) NOT NULL,
  `horaire` time DEFAULT NULL,
  `date_seance` date DEFAULT NULL,
  `film_id` int(11) DEFAULT NULL,
  `salle_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `seance`
--

INSERT INTO `seance` (`id`, `horaire`, `date_seance`, `film_id`, `salle_id`) VALUES
(1, '20:45:00', '2020-08-29', 1, 1),
(2, '14:45:00', '2020-08-29', 3, 1),
(3, '20:40:00', '2020-09-02', 2, 2),
(4, '15:10:00', '2020-12-25', 1, 2),
(5, '12:45:00', '2020-09-02', 2, 3),
(6, '22:10:00', '2020-09-09', 5, 4),
(7, '18:10:00', '2020-09-09', 1, 4),
(8, '14:20:00', '2020-09-09', 6, 5),
(9, '13:40:00', '2020-09-29', 2, 5),
(10, '16:00:00', '2020-09-02', 1, 6),
(11, '18:30:00', '2020-09-29', 3, 7),
(12, '20:10:00', '2020-08-29', 2, 7),
(13, '14:25:00', '2020-09-04', 2, 8),
(14, '13:00:00', '2020-08-29', 3, 9),
(15, '16:00:00', '2020-08-29', 1, 10),
(16, '20:45:00', '2020-09-29', 2, 10),
(17, '18:25:00', '2020-09-04', 3, 8),
(18, '10:44:00', '2020-09-07', 1, 11),
(19, '19:45:00', '2020-10-07', 5, 32),
(20, '11:20:00', '2020-09-24', 1, 13),
(21, '18:20:00', '2020-09-24', 2, 14),
(22, '20:20:00', '2020-09-19', 3, 15),
(23, '10:20:00', '2020-12-24', 4, 16),
(24, '21:00:00', '2020-09-24', 5, 17),
(25, '14:20:00', '2020-10-07', 6, 18),
(26, '18:20:00', '2020-09-13', 7, 20),
(27, '11:20:00', '2020-08-21', 7, 21),
(28, '16:20:00', '2020-09-11', 3, 22),
(29, '19:20:00', '2020-09-22', 4, 23),
(30, '13:20:00', '2020-09-05', 3, 24),
(31, '11:20:00', '2020-09-23', 1, 25),
(32, '17:20:00', '2020-09-28', 5, 26),
(33, '11:20:00', '2020-10-20', 1, 27),
(34, '11:20:00', '2020-10-21', 1, 28),
(35, '20:40:00', '2020-10-30', 2, 29),
(36, '20:30:00', '2020-12-07', 6, 30),
(37, '13:20:00', '2020-09-17', 3, 31),
(38, '20:00:00', '2020-09-20', 5, 12);

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

CREATE TABLE `ville` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ville`
--

INSERT INTO `ville` (`id`, `nom`) VALUES
(1, 'Rennes'),
(2, 'Nantes'),
(3, 'Paris'),
(4, 'Grenoble'),
(5, 'Montpellier'),
(6, 'Nancy');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `acteur`
--
ALTER TABLE `acteur`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `cinema`
--
ALTER TABLE `cinema`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlvtp8ai7p3s64ortjn45txnmb` (`ville_id`);

--
-- Index pour la table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3279817n8796ys3exdnkn0l0x` (`category_id`),
  ADD KEY `FK472nuunvd4qs51a2kt3uutnpe` (`language_id`);

--
-- Index pour la table `film_acteurs`
--
ALTER TABLE `film_acteurs`
  ADD KEY `FKne9plolj4btuawch1i3awynv9` (`acteurs_id`),
  ADD KEY `FK2c21kydg6kxp0pdrr8ox1v518` (`film_id`);

--
-- Index pour la table `language`
--
ALTER TABLE `language`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `place`
--
ALTER TABLE `place`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK548htv3lw7hnylornkfyccoo4` (`salle_id`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKnqrq9wvdum1hkwlvwrhr6ehma` (`place_id`),
  ADD KEY `FKnlda1yh45srl4l3iybpca77bm` (`seance_id`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKh6hhnbcib3luf00t8n8scwdha` (`cinema_id`);

--
-- Index pour la table `seance`
--
ALTER TABLE `seance`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKchlcmip8ejlfuo4c990k5ry8y` (`film_id`),
  ADD KEY `FKhupu0bkkkinurpu14xeyjcuep` (`salle_id`);

--
-- Index pour la table `ville`
--
ALTER TABLE `ville`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `acteur`
--
ALTER TABLE `acteur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT pour la table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `cinema`
--
ALTER TABLE `cinema`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT pour la table `film`
--
ALTER TABLE `film`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `language`
--
ALTER TABLE `language`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `place`
--
ALTER TABLE `place`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;
--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT pour la table `salle`
--
ALTER TABLE `salle`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT pour la table `seance`
--
ALTER TABLE `seance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
--
-- AUTO_INCREMENT pour la table `ville`
--
ALTER TABLE `ville`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `cinema`
--
ALTER TABLE `cinema`
  ADD CONSTRAINT `FKlvtp8ai7p3s64ortjn45txnmb` FOREIGN KEY (`ville_id`) REFERENCES `ville` (`id`);

--
-- Contraintes pour la table `film`
--
ALTER TABLE `film`
  ADD CONSTRAINT `FK3279817n8796ys3exdnkn0l0x` FOREIGN KEY (`category_id`) REFERENCES `categorie` (`id`),
  ADD CONSTRAINT `FK88s9635v5hddv7cwig75m3ne2` FOREIGN KEY (`language_id`) REFERENCES `language` (`id`);

--
-- Contraintes pour la table `film_acteurs`
--
ALTER TABLE `film_acteurs`
  ADD CONSTRAINT `FK2c21kydg6kxp0pdrr8ox1v518` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`),
  ADD CONSTRAINT `FKne9plolj4btuawch1i3awynv9` FOREIGN KEY (`acteurs_id`) REFERENCES `acteur` (`id`);

--
-- Contraintes pour la table `place`
--
ALTER TABLE `place`
  ADD CONSTRAINT `FK548htv3lw7hnylornkfyccoo4` FOREIGN KEY (`salle_id`) REFERENCES `salle` (`id`);

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FKnlda1yh45srl4l3iybpca77bm` FOREIGN KEY (`seance_id`) REFERENCES `seance` (`id`),
  ADD CONSTRAINT `FKnqrq9wvdum1hkwlvwrhr6ehma` FOREIGN KEY (`place_id`) REFERENCES `place` (`id`);

--
-- Contraintes pour la table `salle`
--
ALTER TABLE `salle`
  ADD CONSTRAINT `FKh6hhnbcib3luf00t8n8scwdha` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`);

--
-- Contraintes pour la table `seance`
--
ALTER TABLE `seance`
  ADD CONSTRAINT `FKchlcmip8ejlfuo4c990k5ry8y` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`),
  ADD CONSTRAINT `FKhupu0bkkkinurpu14xeyjcuep` FOREIGN KEY (`salle_id`) REFERENCES `salle` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
