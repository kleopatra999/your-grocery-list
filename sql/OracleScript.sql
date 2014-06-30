CREATE TABLE USER
(
	userId 			NUMBER(18) NOT NULL,
	userGroupId   	NUMBER(18),
	name   			VARCHAR2(255 CHAR),
	email 		    VARCHAR2(255 CHAR) NOT NULL,
	password        VARCHAR2(255 CHAR), 
	phone           NUMBER(12),
	address         VARCHAR2(2000 CHAR),
	version			NUMBER(18),
	PRIMARY KEY (employee_id)
);

CREATE TABLE USER_GROUPS
(
	userGroupId 	NUMBER(18) NOT NULL,
	userGroupName 	VARCHAR2(255 CHAR) NOT NULL,
	PRIMARY KEY (userGroupId)
);

CREATE TABLE USER_GROUP_ROLES
(
	userGroupRoleId NUMBER(18) NOT NULL,
	userGroupId 	NUMBER(18) NOT NULL,
	roleId 			NUMBER(18),
	PRIMARY KEY (userGroupRoleId)
);

CREATE TABLE ROLE
(
	roleId 			NUMBER(18) NOT NULL,
	roleName 		VARCHAR2(255 CHAR),
	roleDescription VARCHAR2(255 CHAR),
	PRIMARY KEY (roleId)
);

CREATE TABLE CHECKOUT
(
	checkoutId  	NUMBER(18) NOT NULL,
	userId 			NUMBER(18) NOT NULL,
	locationId  	NUMBER(18) NOT NULL,
	checkoutDate 	DATE,
	subTotal 		NUMBER(8,2),
	tax 			NUMBER(6,2),
	PRIMARY KEY (checkoutId)
);

CREATE TABLE LOCATION
(
	locationId		NUMBER(18) NOT NULL,
	name			VARCHAR2(255 CHAR),
	address			VARCHAR2(2000 CHAR),
	PRIMARY KEY (locationId)
);

CREATE TABLE CHECKOUT_ACTION
(
	itemId 			NUMBER(18) NOT NULL,
	checkoutId		NUMBER(18) NOT NULL,
	quantity 		NUMBER(18),
	PRIMARY KEY (itemId)
);

CREATE TABLE ITEMS
( 
	itemId 			NUMBER(18) NOT NULL,
	categoryId		NUMBER(18) NOT NULL,
	itemName		VARCHAR2(255 CHAR),
	brandName		VARCHAR2(255 CHAR),
	description		VARCHAR2(255 CHAR),
	itemPrice		NUMBER(8,2),
	itemCost		NUMBER(8,2),
	taxable			NUMBER(1),
	image			BLOB(16M),
	PRIMARY KEY (itemId)
);

CREATE TABLE INVENTORY
(
	inventoryId 	NUMBER(18) NOT NULL,
	itemId			NUMBER(18),
	itemName		VARCHAR2(255 CHAR),
	quantity		NUMBER(18),
	PRIMARY KEY (inventoryId)
);

CREATE TABLE CATEGORY
(
	categoryId		NUMBER(18) NOT NULL,
	parentId		NUMBER(18),
	categoryName	VARCHAR2(255 CHAR),
	description		VARCHAR2(255 CHAR),
	PRIMARY KEY (categoryId)
);

