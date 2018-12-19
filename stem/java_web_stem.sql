/*
 Navicat Premium Data Transfer

 Source Server         : Spring_boot_test
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : java_web_stem

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 19/12/2018 22:01:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for stem
-- ----------------------------
DROP TABLE IF EXISTS `stem`;
CREATE TABLE `stem`  (
  `id` int(11) NOT NULL,
  `stem_id` int(11) NULL DEFAULT NULL,
  `stem_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stem
-- ----------------------------
INSERT INTO `stem` VALUES (1, 1001, 'Different things usually stand for different feelings. Red, for example, is the color of fire, heat, blood and life. People say red is an exciting and active color. They associate(使发生联系) red with a strong feeling like 1 . Red is used for signs of 2 , such as STOP signs and fire engines. Orange is the bright, warm color of 3 in autumn. People say orange is a 4 color. They associate orange with happiness. Yellow is the color of __5__. People say it is a cheerful color. They associate yellow too, with happiness. Green is the cool color of grass in __6__. People say it is a refreshing color. In general, people __7__ two groups of colors: warm colors and cool colors. The warm colors are red, orange and __8__. Where there are warm color and a lot of light, people usually want to be __9__. Those who like to be with __10 _ like red. The cool colors are __11_ and blue. Where are these colors, people are usually worried. Some scientists say that time seems to __12 _ more slowly in a room with warm colors. They suggest that a warm color is a good __13_ for a living room or a __14_ . People who are having a rest or are eating do not want time to pass quickly. __15 colors are better for some offices if the people working there want time to pass quickly.');

-- ----------------------------
-- Table structure for stem_answer
-- ----------------------------
DROP TABLE IF EXISTS `stem_answer`;
CREATE TABLE `stem_answer`  (
  `stem_id` int(4) UNSIGNED ZEROFILL NOT NULL,
  `choose_id` int(11) NOT NULL,
  `right_answer` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `answer_analysis` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stem_answer
-- ----------------------------
INSERT INTO `stem_answer` VALUES (1001, 1, 'B', '根据上文的strong feeling可知anger最合乎文意。');
INSERT INTO `stem_answer` VALUES (1001, 2, 'C', '下文所列举的例子STOP signs和 fire engines都属于危险信号，故选择danger。');
INSERT INTO `stem_answer` VALUES (1001, 3, 'B', '根据常识，黄色应是秋天树叶的颜色，故应选leaves。');
INSERT INTO `stem_answer` VALUES (1001, 4, 'A', '下文提到人们把黄色和幸福联系起来，说明黄色是一个充满生机的颜色，故选lively。');
INSERT INTO `stem_answer` VALUES (1001, 5, 'C', '下文提到黄色是令人愉快的颜色，根据常识太阳光的颜色是黄色，故选sunlight。');
INSERT INTO `stem_answer` VALUES (1001, 6, 'B', '绿色是春季里草的颜色，故选spring。');
INSERT INTO `stem_answer` VALUES (1001, 7, 'C', 'speak后面往往接某种语言作宾语;say后面常接说话的内容;tell的宾语一般是人;talk about sth.意为谈论某事物。故C为正确选项。');
INSERT INTO `stem_answer` VALUES (1001, 8, 'B', '根据上文对yellow的解释。说明yellow也属于warm color。');
INSERT INTO `stem_answer` VALUES (1001, 9, 'C', '与下文喜欢冷色调的人相对应，再根据上文对各种暖色调的选择，active合乎文意为正确选项。');
INSERT INTO `stem_answer` VALUES (1001, 10, 'D', 'others相当于other people意为“别的人”。another指“另一个”。other one不可单独使用，the other one指“另外的一个”。');
INSERT INTO `stem_answer` VALUES (1001, 11, 'A', '四个选项中只有black可归纳到冷色调当中去。');
INSERT INTO `stem_answer` VALUES (1001, 12, 'B', 'go around意为“到处走动”;go off 意为“离开，爆炸”;go along意为“前进，进行”;go by意为“走过，流逝”。根据文意，应选go by。');
INSERT INTO `stem_answer` VALUES (1001, 13, 'B', 'way根据上文，暖色调的环境下时间似乎过得更慢，说明暖色调是用来装饰居室和饭馆的好方法，故选择way。');
INSERT INTO `stem_answer` VALUES (1001, 14, 'C', '比较四个场所只有饭馆适合使用暖色调。');
INSERT INTO `stem_answer` VALUES (1001, 15, 'B', '与暖色调相对立，冷色调适用于办公室，以使人感觉时间过得比较快。');

-- ----------------------------
-- Table structure for stem_choose_content
-- ----------------------------
DROP TABLE IF EXISTS `stem_choose_content`;
CREATE TABLE `stem_choose_content`  (
  `id` int(11) NULL DEFAULT NULL,
  `stem_id` int(11) NULL DEFAULT NULL,
  `choose_id` int(11) NULL DEFAULT NULL,
  `A` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `B` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `C` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `D` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '?洢???Ĵ?ͷ??' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stem_choose_content
-- ----------------------------
INSERT INTO `stem_choose_content` VALUES (1, 1001, 1, 'sadness', 'anger', 'administration', 'smile');
INSERT INTO `stem_choose_content` VALUES (2, 1001, 2, 'roads', ' ways', 'danger', 'places');
INSERT INTO `stem_choose_content` VALUES (3, 1001, 3, 'land', 'leaves', 'grass', 'mountains');
INSERT INTO `stem_choose_content` VALUES (4, 1001, 4, 'lively', 'dark', 'noisy', 'frigthening');
INSERT INTO `stem_choose_content` VALUES (5, 1001, 5, 'moonlight', 'light', 'sunlight', 'stars');
INSERT INTO `stem_choose_content` VALUES (6, 1001, 6, 'summer', 'spring', 'autumn', 'winter');
INSERT INTO `stem_choose_content` VALUES (7, 1001, 7, 'speak', 'say', 'talk about', 'tell');
INSERT INTO `stem_choose_content` VALUES (8, 1001, 8, 'green', 'yellow', 'white', 'gray');
INSERT INTO `stem_choose_content` VALUES (9, 1001, 9, 'calm', 'sleepy', 'active', 'helpful');
INSERT INTO `stem_choose_content` VALUES (10, 1001, 10, 'the other', 'another', 'other', 'others');
INSERT INTO `stem_choose_content` VALUES (11, 1001, 11, 'black', 'green', 'golden', 'yellow');
INSERT INTO `stem_choose_content` VALUES (12, 1001, 12, 'go round', 'go by', 'go off', 'go along');
INSERT INTO `stem_choose_content` VALUES (13, 1001, 13, 'one', 'way', 'fact', 'matter');
INSERT INTO `stem_choose_content` VALUES (14, 1001, 14, 'factory', 'classroom', 'restaurant', 'hospital');
INSERT INTO `stem_choose_content` VALUES (15, 1001, 15, 'Different', 'Cool', 'Warm', 'All');

SET FOREIGN_KEY_CHECKS = 1;
