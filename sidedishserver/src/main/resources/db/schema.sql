DROP TABLE IF EXISTS `product`;

CREATE TABLE IF NOT EXISTS `product`
(
    `id`                 BIGINT        NOT NULL AUTO_INCREMENT,
    `name`               VARCHAR(45)   NOT NULL,
    `description`        VARCHAR(100)  NOT NULL,
    `price`              INT           NOT NULL,
    `stock`              INT           NOT NULL,
    PRIMARY KEY (`id`)
);
