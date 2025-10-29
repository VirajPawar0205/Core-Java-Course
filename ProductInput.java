package newList;

public class ProductInput {
	private int product_id,stock_qty,sell_st;
	private String name;
	float rate,gst,amm;
	public ProductInput() {
		super();
	}
	public ProductInput(int product_id, int stock_qty, int sell__st, String name, float rate, float gst, float amm) {
		super();
		this.product_id = product_id;
		this.stock_qty = stock_qty;
		this.sell_st = sell__st;
		this.name = name;
		this.rate = rate;
		this.gst = gst;
		this.amm= amm;
	}
	public float getAmm() {
		return amm;
	}
	public void setAmm(float amm) {
		this.amm = amm;
	}
	public int getSell_st() {
		return sell_st;
	}
	public void setSell_st(int sell_st) {
		this.sell_st = sell_st;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getStock_qty() {
		return stock_qty;
	}
	public void setStock_qty(int stock_qty) {
		this.stock_qty = stock_qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getGst() {
		return gst;
	}
	public void setGst(float gst) {
		this.gst = gst;
	}

}
