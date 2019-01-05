/*
 Navicat Premium Data Transfer

 Source Server         : Spring_boot_test
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : final_exam

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 04/01/2019 20:35:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for stem
-- ----------------------------
DROP TABLE IF EXISTS `stem`;
CREATE TABLE `stem`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stem_id` int(11) UNSIGNED NOT NULL COMMENT '题的编号，作为选项和答案的外键',
  `stem_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '题干',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stem_id`(`stem_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stem
-- ----------------------------
INSERT INTO `stem` VALUES (1, 1001, 'Different things usually stand for different feelings. Red, for example, is the color of fire, heat, blood and life. People say red is an exciting and active color. They associate(使发生联系) red with a strong feeling like 1 . Red is used for signs of 2 , such as STOP signs and fire engines. Orange is the bright, warm color of 3 in autumn. People say orange is a 4 color. They associate orange with happiness. Yellow is the color of __5__. People say it is a cheerful color. They associate yellow too, with happiness. Green is the cool color of grass in __6__. People say it is a refreshing color. In general, people __7__ two groups of colors: warm colors and cool colors. The warm colors are red, orange and __8__. Where there are warm color and a lot of light, people usually want to be __9__. Those who like to be with __10 _ like red. The cool colors are __11_ and blue. Where are these colors, people are usually worried. Some scientists say that time seems to __12 _ more slowly in a room with warm colors. They suggest that a warm color is a good __13_ for a living room or a __14_ . People who are having a rest or are eating do not want time to pass quickly. __15 colors are better for some offices if the people working there want time to pass quickly.');
INSERT INTO `stem` VALUES (2, 1002, 'Charlie came from a poor village. His parents had __1__ money to send him to school when he was young. The boy was very sad. Mr. King lived next to him. He found the boy __2__ and had pity on him and lent some money to him. So the boy could go to school. He studied hard and __3__ all his lessons. When he finished middle school, the man introduced him to his friend in the town. And he began to work.\r\n　　Once Mr. King was seriously hurt in an accident. Dying, he asked Charlie to take care of his daughter, Sharon. The young man __4__ and several years later he married the girl. He loved her very much and tried his best to make her happy. He often bought beautiful clothes and delicious food for her. He was good at cooking and he cooked __5__ for her. So she became very fat and she felt it difficult to walk. And one day she found there was something wrong with her heart. Her husband wasn’t at home and she had to go to __6__ at once. The doctors looked her over and told her __7__ eat meat, sugar, chocolate and things like these. She was afraid __8__ the doctor’s words and wrote all the names of the food on the paper. When she got home, she put the list on the table and __9__. When she returned home that afternoon, she found many kinds of food: meat, sugar and chocolate in the kitchen. Charlie was busy __10__ there. As soon as he saw her, he said happily, “I’ve bought all the food you like, dear!”');
INSERT INTO `stem` VALUES (3, 1003, 'Why do I want to go to college? No one has ever asked me __1 _ a question. But many times I have asked myself. I have __2__ a whole variety of reasons. __3__ important reason is that I want to be a better man.\r\n　　Many things make human beings different __4__ or better than or even superior to animals.\r\n　　One of the most important things is __5__ . If I fail to receive higher education, my education __6__. As I want to be a fully __7__ man, I must get a well-rounded education, which good colleges and universities are supposed to __8__. I know one can get educated in many ways, but colleges and universities are __9__ the best places to teach me how to educate myself. Only when I am well-educated, will I be a better human being and __10__ fit into society.');
INSERT INTO `stem` VALUES (4, 1004, 'Farley worked for the Canadian government. One day, he was __1__ to learn more about wolves. Do wolves kill lots of caribou(北美驯鹿)? Do they kill people?\r\n　　They gave him lots of food and clothes and guns. Then they put him on a plane and took him to __2__. The plane put him down and went away. There were no houses or people in this place. But there were lots of animals and lots of wolves.\r\n　　People tell terrible stories about wolves. They say wolves like to kill and eat people. Farley remembered these stories, and he was __3__. He had his gun with him__4_.\r\n　　Then one day, he saw a group of wolves. There was a mother wolf with four baby wolves. A father wolf and another young wolf lived with them.\r\n　　Farley watched these wolves every day. The mother was a very __5__ mother. She gave milk to her babies. She gave them lessons about life. They learned how to __6__ food. The father wolf got food for the mother. The young wolf __7__ the children. They were a nice, happy family—wolf family! Farley did not need his __8__ any more. In a short time, he got on well with the family. Farley watched them for five months. He learned that many stories about the wolves were __9__. Wolves do not eat people, and they do not eat many large animals. And he also learned bad things about men. It was men who killed many caribou and wolves.\r\n　　Later, Farley wrote a book about wolves. He wanted people to __10__ them and not to kill them.');
INSERT INTO `stem` VALUES (5, 1005, 'Many people think that Americans 1 their cars almost more than anything else. When 2__ people are fourteen years old, they want to have their __3_ cars. They don’t ask for a car from their 4__. So many of them work in _5_ time during their last year of high school to buy a car. Learning to 6 _ and getting a driver’s license may be one of the most exciting things in a young person’s life.\r\n　　Some people almost 7 _ go to a doctor when they are ill. But they will __8_ their cars to a garage as soon as they think there is a 9 . On Saturdays or Sundays some people may 10 most of their time washing and repairing their cars.');
INSERT INTO `stem` VALUES (6, 1006, 'For several years, Americans have enjoyed teleshopping-watching TV and buying things by phone. Now teleshopping is starting in Europe. In some __1__ countries, people can turn on their __2__ and shop for clothes, jewelry, food, toys and __3__ things.\r\nTeleshopping is becoming popular in Sweden. __4__, the biggest Swedish company sells different kinds of things on TV in fifteen European countries, and in one year, it makes $10 million. In France, there are two teleshopping channels, and the French __5__ about $ 20 million a year in buying things through those channels.\r\nIn Germany, __6__ last year teleshopping was only possible on one channel for one hour every day. Then the government allowed more teleshopping. Other channels can __7__ for telebusiness, including the largest American teleshopping company and a 24-hour teleshopping company. German __8__ are hoping these will help them sell more things.\r\nSome people like teleshopping because it allows them to do their shopping without __9__. With all the traffic problems in cities, going shopping is not an easy thing. But at the same time, other Europeans __10__ like this new way of buying things. They call __11__ “junk on the air.” Many Europeans usually worry about the quality of the things __12__ on TV. They think high quality is the most important thing, and they don’t believe they can be sure about the quality of the things __13__.\r\nThe need of high quality means that European teleshopping companies will have to be __14__ the American companies. They will have to be more careful about __15__ of the things they sell. They will also have to work harder to sell things that the buyers cannot touch or see by themselves.');
INSERT INTO `stem` VALUES (7, 1007, 'Last Friday, after doing all the family shopping in the town. I wanted to have a rest before catching the rain. I __1__ a newspaper and some chocolate and __2__ into the station coffee shop. It was a cheap self-service place with long tables to __3__ at. I put my heavy bag down on the floor, __4__ the newspaper and the chocolate on the table and then went to get a cup of coffee.\r\nWhen I came back with the coffee, There was someone __5__ in the next seat. __6__ was a boy, with dark glasses and old clothes, and __7__ bright red at the front. He had started to eat my chocolate!\r\nNaturally, I was rather uneasy about him, but I didn’t want to have any __8__. I just read the newspaper, tasted my coffee and took a bit of chocolate. The boy looked at me in __9__.Then he took a __10__ piece of my chocolate. I could hardly believe it. Still I didn’t say anything to him. When he took a third piece, I felt more angry than uneasy. I thought, “Well, I shall have the last piece.” And I got it.\r\nThe boy gave me a strange look, then __11__ up. As he left, he shouted out, “There’s something __12__ with that woman!” Everyone looked at me, __13__ I didn’t want to quarrel with the boy, so I kept quiet. I did not realize that I had __14__ a mistake until I finished my coffee and was ready to __15__. My face turned red when I saw my unopened chocolate under the newspaper. The chocolate that I had been eating was the boy’s!');

-- ----------------------------
-- Table structure for stem_answer
-- ----------------------------
DROP TABLE IF EXISTS `stem_answer`;
CREATE TABLE `stem_answer`  (
  `stem_id` int(4) UNSIGNED ZEROFILL NOT NULL COMMENT '题的编号',
  `choose_id` int(11) NOT NULL COMMENT '选项的编号',
  `right_answer` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '正确答案',
  `answer_analysis` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '答案分析',
  INDEX `stem_id`(`stem_id`, `choose_id`) USING BTREE,
  INDEX `s_id`(`stem_id`, `choose_id`) USING BTREE
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
INSERT INTO `stem_answer` VALUES (1002, 1, 'A', '查理家境贫困，父母没有钱资助他上学，故选no。');
INSERT INTO `stem_answer` VALUES (1002, 2, 'B', '根据下文，查理不负众望，说明他聪明好学，故选clever。');
INSERT INTO `stem_answer` VALUES (1002, 3, 'A', '查理学习刻苦，并顺利完成了学业，说明他各门功课成绩较好，故选did well in。D选项介词用错，正确词组为was good at。');
INSERT INTO `stem_answer` VALUES (1002, 4, 'C', '根据下文查理娶了金先生女儿为妻并精心呵护她，说明查理同意了金先生的请求，故选agreed。');
INSERT INTO `stem_answer` VALUES (1002, 5, 'D', '根据下文妻子胖得不能走路，说明她食物吃得多。此外食物为不可数名词，因此只能用a lot of来修饰。');
INSERT INTO `stem_answer` VALUES (1002, 6, 'C', '心脏不好，应去医院检查，下文指出为她检查的正是医生，故选hospital。');
INSERT INTO `stem_answer` VALUES (1002, 7, 'D', '由于她的病是因营养过剩引起的，医生应让她不要吃肉，糖果之类的食物，故选not to');
INSERT INTO `stem_answer` VALUES (1002, 8, 'B', '她害怕忘了医生的指示，因此将其写在纸上，故选to forget。');
INSERT INTO `stem_answer` VALUES (1002, 9, 'B', '与下文相对应，这里应填went out。');
INSERT INTO `stem_answer` VALUES (1002, 10, 'C', '擅长烹饪的查理将菜买回之后，肯定要忙着为爱妻做饭，故cooking为正确答案。');
INSERT INTO `stem_answer` VALUES (1003, 1, 'C', 'such常用在不定冠词或名词前修饰可数名词或不可数名词，表示“此类的”、“这种的”，故such为正确选项。');
INSERT INTO `stem_answer` VALUES (1003, 2, 'A', 'come up with意为“提出、找出”;agree with意为“同意”;be fed up with意为“对……厌倦”;get on well with意为“和……相处得好”。根据文意A为正确选项。');
INSERT INTO `stem_answer` VALUES (1003, 3, 'B', '上文讲到我曾找到过各种各样的原因，其中最重要的原因应当是……，因此这里应用important的最高级，故选the most。');
INSERT INTO `stem_answer` VALUES (1003, 4, 'D', '固定结构be different from 表示“不同于……”。');
INSERT INTO `stem_answer` VALUES (1003, 5, 'A', '本段着重说明了教育在人的发展中的作用，以及大学在教育中的地位。作为总括句，本空应填education。');
INSERT INTO `stem_answer` VALUES (1003, 6, 'C', '这是一个含有条件状语从句的复合句，意为“如果我不能受到更高等的教育，我就无法完成我的学业”，故选will not finish为正确选择。');
INSERT INTO `stem_answer` VALUES (1003, 7, 'B', '这里只能选可作定语的选项。过去分词developed表示“成熟的”，为正确选项。');
INSERT INTO `stem_answer` VALUES (1003, 8, 'D', '大学应是提供高等教育的地方, provide符合文意为正确选项。');
INSERT INTO `stem_answer` VALUES (1003, 9, 'B', '介词among可表示”包括……在内”为正确选项。');
INSERT INTO `stem_answer` VALUES (1003, 10, 'C', '与前半句相对应，这里仍应用比较级，而may better意思不对，因此be able to better为正确选项。');

-- ----------------------------
-- Table structure for stem_choose_content
-- ----------------------------
DROP TABLE IF EXISTS `stem_choose_content`;
CREATE TABLE `stem_choose_content`  (
  `stem_id` int(4) UNSIGNED ZEROFILL NOT NULL COMMENT '题的编号',
  `choose_id` int(11) NOT NULL COMMENT '选项编号',
  `choose_A` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `choose_B` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `choose_C` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `choose_D` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  INDEX `stem_choose_conttent_id`(`stem_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '?洢???Ĵ?ͷ??' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stem_choose_content
-- ----------------------------
INSERT INTO `stem_choose_content` VALUES (1001, 1, 'sadness', 'anger', 'administration', 'smile');
INSERT INTO `stem_choose_content` VALUES (1001, 2, 'roads', ' ways', 'danger', 'places');
INSERT INTO `stem_choose_content` VALUES (1001, 3, 'land', 'leaves', 'grass', 'mountains');
INSERT INTO `stem_choose_content` VALUES (1001, 4, 'lively', 'dark', 'noisy', 'frigthening');
INSERT INTO `stem_choose_content` VALUES (1001, 5, 'moonlight', 'light', 'sunlight', 'stars');
INSERT INTO `stem_choose_content` VALUES (1001, 6, 'summer', 'spring', 'autumn', 'winter');
INSERT INTO `stem_choose_content` VALUES (1001, 7, 'speak', 'say', 'talk about', 'tell');
INSERT INTO `stem_choose_content` VALUES (1001, 8, 'green', 'yellow', 'white', 'gray');
INSERT INTO `stem_choose_content` VALUES (1001, 9, 'calm', 'sleepy', 'active', 'helpful');
INSERT INTO `stem_choose_content` VALUES (1001, 10, 'the other', 'another', 'other', 'others');
INSERT INTO `stem_choose_content` VALUES (1001, 11, 'black', 'green', 'golden', 'yellow');
INSERT INTO `stem_choose_content` VALUES (1001, 12, 'go round', 'go by', 'go off', 'go along');
INSERT INTO `stem_choose_content` VALUES (1001, 13, 'one', 'way', 'fact', 'matter');
INSERT INTO `stem_choose_content` VALUES (1001, 14, 'factory', 'classroom', 'restaurant', 'hospital');
INSERT INTO `stem_choose_content` VALUES (1001, 15, 'Different', 'Cool', 'Warm', 'All');
INSERT INTO `stem_choose_content` VALUES (1002, 1, 'no', 'some', 'enough', 'much');
INSERT INTO `stem_choose_content` VALUES (1002, 2, 'lazy', 'clever', 'hard', 'careful');
INSERT INTO `stem_choose_content` VALUES (1002, 3, 'did well in', ' was poor at', 'was good for', 'was working');
INSERT INTO `stem_choose_content` VALUES (1002, 4, 'was angry', 'thought hard', 'said\"No.\"', 'agreed');
INSERT INTO `stem_choose_content` VALUES (1002, 5, 'a little', 'a few', 'a lot', 'many');
INSERT INTO `stem_choose_content` VALUES (1002, 6, 'rest', 'sleep', 'work', 'hospital');
INSERT INTO `stem_choose_content` VALUES (1002, 7, 'should', 'would', 'not to', 'to');
INSERT INTO `stem_choose_content` VALUES (1002, 8, 'to remember', 'to forget', 'to teach', 'to catch');
INSERT INTO `stem_choose_content` VALUES (1002, 9, 'slept', 'went out', 'ate', 'cooked');
INSERT INTO `stem_choose_content` VALUES (1002, 10, 'reading', 'seeing', 'writing', 'cooking');
INSERT INTO `stem_choose_content` VALUES (1003, 1, 'quite', 'so', 'such', 'another');
INSERT INTO `stem_choose_content` VALUES (1003, 2, 'come up with', 'agreed with', 'been fed up with', 'got on well with');
INSERT INTO `stem_choose_content` VALUES (1003, 3, 'Most', 'The most', 'More', 'Much');
INSERT INTO `stem_choose_content` VALUES (1003, 4, 'to', 'around', 'between', 'from');
INSERT INTO `stem_choose_content` VALUES (1003, 5, 'education', 'weather', 'temperature', 'science');
INSERT INTO `stem_choose_content` VALUES (1003, 6, 'finished', 'don\'t finish', 'will not finish', 'has finished');
INSERT INTO `stem_choose_content` VALUES (1003, 7, 'develop', 'developed', 'developing', 'exprience');
INSERT INTO `stem_choose_content` VALUES (1003, 8, 'improve', 'graduate', 'hear', 'privide');
INSERT INTO `stem_choose_content` VALUES (1003, 9, 'between', 'among', 'inside', 'outside');
INSERT INTO `stem_choose_content` VALUES (1003, 10, 'can good', 'may better', 'be able to better', 'ba able to best');

SET FOREIGN_KEY_CHECKS = 1;
