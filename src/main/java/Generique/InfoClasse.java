package Generique;

public class InfoClasse {
	private String nomAttribut;
    private Class<?> typeAttibut;
	/**
	 * @param nomAttribut
	 * @param typeAttibut
	 */
	public InfoClasse(String nomAttribut, Class<?> typeAttibut) {
		super();
		this.nomAttribut = nomAttribut;
		this.typeAttibut = typeAttibut;
	}
	/**
	 * @return the nomAttribut
	 */
	public String getNomAttribut() {
		return nomAttribut;
	}
	/**
	 * @param nomAttribut the nomAttribut to set
	 */
	public void setNomAttribut(String nomAttribut) {
		this.nomAttribut = nomAttribut;
	}
	/**
	 * @return the typeAttibut
	 */
	public Class<?> getTypeAttibut() {
		return typeAttibut;
	}
	/**
	 * @param typeAttibut the typeAttibut to set
	 */
	public void setTypeAttibut(Class<?> typeAttibut) {
		this.typeAttibut = typeAttibut;
	}
	@Override
	public String toString() {
		return "InfoClasse [nomAttribut=" + nomAttribut + ", typeAttibut=" + typeAttibut + "]";
	}

    

}
