struct node{
	int data;
	struct node *next;
};


int main(){

	int n,x;

	struct node *head,*p;

	printf("Create List ,Enter n : ");
	scanf("%d",&n);
	head = create_number(n);//自动生成N个结点的链表
	printf("List: ");      //打印出链表
	out_list(head);
	printf("x: ");        //输入要查找的值
	scanf("%d",&x);
	p = find(head,x);

	head = delete(head,p);//进行删除操作
	printf("Result:");
	out_list(head);

	return 0;

}

struct node *create_number(int n){
	int i;
	//struct node data = 
	for(i=0;i< n;i++){
		
	}


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
struct node *find(struct node *head,int m){
	//指针p指向链表首地址
	struct node *p = head;
	while(p!=null&&p->data!=m)
		p=p->next;
	if(p==null)
		return(null);
	else 
		return(p);

}
