package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.exceptions.ExceptionDpt;
import fr.diginamic.recensement.exceptions.ExceptionMax;
import fr.diginamic.recensement.exceptions.ExceptionMin;
import fr.diginamic.recensement.exceptions.ExceptionMinMax;
import fr.diginamic.recensement.exceptions.ExceptionNumber;

/**
 * Classe représentant un service
 * 
 * @author DIGINAMIC
 *
 */
public abstract class MenuService {

	/**
	 * Méthode abstraite de traitement que doivent posséder toutes les méthodes de
	 * services
	 * 
	 * @param lignes  lignes du fichier
	 * @param scanner scanner
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner) throws ExceptionDpt, ExceptionMinMax, ExceptionMax, ExceptionMin, ExceptionNumber;
}
