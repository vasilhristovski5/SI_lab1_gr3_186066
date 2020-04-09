class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char tipDanok;
	//TODO constructor
	public Item(int id, String name, double price, char tipDanok){
            this.id=id;
            this.name=name;
            this.price=price;
            this.tipDanok=tipDanok;
        }
	//TODO setters and getters
	public void setId(int id){
            this.id=id;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setPrice(double price){
            this.price=price;
        }
        public void setTipDanok(char tipDanok) {
            this.tipDanok = tipDanok;
        }
	public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public double getPrice(){
            return price;
        }
        public char getTipDanok(){
            return tipDanok;
        }
	double taxReturn (int id, String name, double price, char tipDanok) {
		//TODO
	    if(tipDanok=='A'){
                return 0.15*0.18*price;
            }
            else if (tipDanok=='B'){
                return 0.15*0.05*price;
            }
            else if (tipDanok=='V'){
                return 0.0;
            }
	}
}