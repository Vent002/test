#include<stdio.h>
#include<string.h>

struct student{
	int num;
	char name[20];
	char sex;
	float score;
}stu1,stu2;

struct student1{
	int num;//学号
	char name[20];//姓名
	char sex[4];//性别
	float score;//成绩
};

struct teacher{
	int teacher_num;
	char teacher_name[32];
	char teacher_sex[4];
	int teacher_rank;
	float teacher_salary;
};

/*
int main(){
	struct student stu = {2016,"溜溜","男",79};

	struct teacher tea = {1110,"王五","男",002,6434.89};
	
	printf("学生信息：\n");
	printf("Name:%s\n",stu.name);
	printf("Sex:%s\n",stu.sex);
	printf("Score:%d",stu.score);
	printf("\n\n\n");
	printf("老师信息：\n");
	printf("Name:%s\n",tea.teacher_name);
	printf("Sex:%s\n",tea.teacher_sex);


	
	return 0;

}

//输出最高分
int main(){

	printf("student info 1:\n");
	scanf("%d%s%s%f", &stu1.num , stu1.name , stu1.sex , &stu1.score);
	
	printf("student info 2:\n");
	scanf("%d%s%s%f", &stu2.num , stu2.name , stu2.sex , &stu2.score);

	if(stu1.score >= stu2.score){
		printf("the best student：\n Name:%s\tScore:%.2f\n",stu1.name,stu1.score);
	}else
		printf("the best student：\n Name:%s\tScore:%.2f\n",stu2.name,stu2.score);

	return 0;

}

//结构体数组

int main(){
	struct student stu[5];
	cout<<"输入学生信息\n\n\n";
	for(int i=0;i<5;i++){
		cout<<"输入第%d个学生信息",i);
		scanf("%d%s%s%f",&stu[i].num,stu[i].name,stu[i].sex,&stu[i].score);
	}




 return 0;
}


//结构体指针
//指向结构体数据的指针变量

int main(){

	struct student1 stu,*p;
	p=&stu;
	p->num=1;
	strcpy(p->name,"beijing");
	p->sex='男';
	p->score=991;

	printf("%d%s%s%f",stu.num,stu.name,p->sex,p->score);

	return 0;
}
*/

struct student{
	int stu_num;
	char stu_name[20];
	char stu_sex[4];
	int stu_sorce;
};

int main(){

	struct student *next,*p;
	



}

//删除结点
struct node *delete(struct node *head,struct node *p){
	struct node *q;
	//空链表
	if(p == null){
		return(head);
	}
	//删除第一个结点
	if(p == head)
		head = head->next;

	//将要删除的节点的上一个指针指向删除结点的下一个结点的地址
	else{
		while(q->next!=p)
			q=q->next;
		q->next = p->next;
	}
	//释放链表空间，以达到删除链表的效果
	free(p);
	return(head);

}

//链表的查找

