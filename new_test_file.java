public void test(){
	System.out.print("new test");
}
boolean insert(Model model){
	return this.modelDao.insert(model);
}