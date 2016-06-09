public void test(){
	System.out.print("new test");
}
boolean insert(Model model){
	return this.modelDao.insert(model);
}
Model findById(String mid){
	return this.modelDao.findById(mid) ;
}

笨蛋！！！