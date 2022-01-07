def functie = "directeur"
def salaris = 1000;

switch (functie) {
	case "directeur": 
		salaris *=  2; 
		break;

	case "manager": 
		salaris *=  1.5; 
		break;

	case "verkoper": 
		salaris *=  1.2; 
		break;

	default:
		salaris *= 1.1;
}

println salaris