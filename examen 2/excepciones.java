try {

} catch (NoEncontradoException ex) {
	System.out.println(“Error: “ + ex.getMessage());
} catch (VacioExcepcion ex) {
	System.out.println(“Error: “ + ex.getMessage());
}
finally {
	System.out.println(“se ejecuta finally..”);
}