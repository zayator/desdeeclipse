package pruebas;

import java.util.*;

import utilidades.copy.Entrada;

public class juego {
	public static int random(int r1) {
		Random r = new Random();
		int n;
		n = r.nextInt(r1);
		return n;
	}

	public static void main(String[] args) {
		boolean salidatotal = false, salida = false, error = false, bajar = true, palo = false, llaves = false,
				vampiro = true, linterna = false;
		String decision = "", intro = "";
		int norte = 0, sur = 0, este = 0, oeste = 0, horario = 0, chocar = 0;
		System.out.println(" BIENVENIDO A UN SIMULADOR REALISTA");
		do {
			// dialogo inicial
			System.out.println("┍--------------------------------------┒");
			System.out.println("|SI DESEA SALIR, ESCRIBA:     `salir´  |");
			System.out.println("|SI DESEA AYUDA , ESCRIBA: `!help´     |");
			System.out.println("|SI DESEA EMPEZAR ,ESCRIBA:   `empezar´|");
			System.out.println("┕--------------------------------------┚");
			System.out.print(">");
			intro = Entrada.cadena().toLowerCase();
			intro.toLowerCase();
			switch (intro) {
			case "salir":
				salida = true;
				error = false;
				salidatotal = true;
				break;
			case "empezar":
				salida = false;
				break;
			case "!help":
				salida = false;

				break;
			default:
				error = true;
				salida = false;
				break;
			}
			while (!salida) {
				if (!error) {
					// lista de comandos(!help)
					if (intro.equals("!help") || decision.equals("!help")) {
						intro = "a";
						System.out.println(
								"AQUI TIENES UNA LISTA DE ALGUNAS COSAS QUE SE PUEDEN HACER (AUNQUE HAY MAS ACCIONES OCULTAS):");
						System.out.println("mirar alrededor");
						System.out.println("subir  a un arbol");
						System.out.println("caminar hacia el norte/sur/este/oeste");
						System.out.println("");
					}
					// pregunta del principio
					System.out.println("");
					System.out.println("TE ENCUENTRAS EN MEDIO DE UN BOSQUE");
					System.out.println("¿QUE HACES?");
					System.out.print(">");
					decision = Entrada.cadena().toLowerCase();

					if (decision.equals("mirar alrededor")) {
						System.out.println("HAY MUCHOS ARBOLES , ESTAS EN UN BOSQUE, QUE ESPERABAS");
						System.out.println("");
					}
					// subir a un arbol
					if (decision.equals("subir a un arbol")) {
						System.out.println("SUBES Y SOLO VES ARBOLES , YA QUE ESTAS EN UN BOSQUE");
						System.out.println("");
						bajar = !bajar;
						while (!bajar) {
							System.out.print(">");
							decision = Entrada.cadena().toLowerCase();
							decision.toLowerCase();
							if (decision.equals("saltar")) {
								System.out.println(
										"SALTAS DESDE UN ARBOL Y SUFRES UNA DOLOROSA CAIDA , PERO NO MUERES AL INSTANTE ");
								System.out.println(
										"SINO QUE SUFRES UN COHAGULO DE SANGRE EN EL CEREBRO DEBIDO A UN DESANGRAMIENTO INTERNO");
								System.out.println("TUS ÚLTIMAS PALABRAS ANTES DE MORIR FUERON: ");
								System.out.println(
										"<¿Que clase de estupido decide saltar de cabeza desde un arbol? , no se que esperaba>");
								bajar = true;
								salida = true;
								salidatotal = true;
							}
							if (decision.equals("bajar")) {
								bajar = true;
							}
							if (!bajar) {
								System.out.println("ESTAS SUBIDO A UN ARBOL , TIENES QUE BAJAR");
								System.out.println("");
							}
						}
					}
					// caminas hacia el norte
					if (decision.equals("caminar hacia el norte") || decision.equals("ir hacia el norte")
							|| decision.equals("ir al norte")) {
						System.out.println();
						norte = norte + 1;
						sur = sur - 1;
						horario = horario + 1;
						System.out.println("CAMINAS HACIA EL NORTE");
						System.out.println("");

						// sur -1,norte 1:
						if (sur == -1 && norte == 1 && este == 0 && oeste == 0) {
							System.out.println("PARECE QUE AL FONDO SE DIVISA UNA EXPLANADA");
						}
						// sur-2 norte+2
						if (sur == -2 && norte == 2 && este == 0 && oeste == 0) {
							System.out.println("CAMINAS HACIA UN CLARO");
							if (vampiro == true) {
								System.out.println("COMO YA ES DE NOCHE , SE TE APARECE DE GOLPE UN VAMPIRO");
								if (palo == true) {
									System.out.println("RECUERDAS QUE ANTES COGISTE UN PALO AFILADO ");
									System.out.println("¿QUIERES ATACARLE?");
									// ATACAR VAMPIRO?
									System.out.print(">");
									decision = Entrada.cadena().toLowerCase();
									if (decision.equals("si") || decision.equals("no")) {
										error = false;
									} else {
										error = true;
									}
									while (error) {
										System.out.println("¿QUIERES ATACARLE?");
										System.out.print(">");
										decision = Entrada.cadena().toLowerCase();
										if (decision.equals("si") || decision.equals("no")) {
											error = false;
										}
									}
									if (!error) {
										if (decision.equals("si")) {
											System.out.println("LE ATACAS CON LA ESTACA/PALO");
											// 1/3 de que falles el ataque y mueras
											Random as = new Random();
											int ataque = as.nextInt(3);
											if (ataque > 0) {
												System.out.println(
														"LE CLAVAS LA ESTACA EN EL CORAZON(por suerte, ya que no se veia nada)");
												System.out.println(
														"MIENTRAS MUERE EL VAMPIRO , TE DICE `أعطيني كباب مع سلطة بدون صلصات´");
												System.out.println("");
												vampiro = false;
												System.out.println(
														"<menos mal que no entiendo esas movidas>, PIENSAS MIENTRAS TE DAN GANAS DE COMER UN KEBAB ");
												System.out.println("");
												System.out.println("");
												System.out.println("VES QUE AL VAMPIRO SE LE CAEN UNAS LLAVES");
												System.out.println("¿QUIERES COGERLAS?");
												System.out.print(">");
												decision = Entrada.cadena().toLowerCase();
												if (decision.equals("si") || decision.equals("no")) {
													error = false;
												} else {
													error = true;
												}
												if (!error) {
													if (decision.equals("si")) {
														llaves = true;
														System.out.println(
																"<jaja,ya ves> DICES MIENTRAS COGES LAS LLAVES");
														llaves = true;
													}
													if (decision.equals("no")) {
														System.out.println(
																"<podrian tener alguna enfermedad> DICES MIENTRAS PASAS DE LAS LLAVES ");

													}

												}
												while (error) {
													System.out.println("¿QUE HACES CON LAS LLAVES?,¿QUIERES COGERLAS?");
													System.out.print(">");
													decision = Entrada.cadena().toLowerCase();
													if (decision.equals("si")) {
														llaves = true;
														System.out.println(
																"<jaja,ya ves> DICES MIENTRAS COGES LAS LLAVES");
														error = false;
													}
													if (decision.equals("no")) {
														System.out.println(
																"<podrian tener alguna enfermedad> DICES MIENTRAS PASAS DE LAS LLAVES ");
														error = false;

													}
												}

											}
											if (ataque == 0) {
												palo = false;
												System.out.println("PERO COMO ES DE NOCHE Y NO VES NADA , FALLAS");
												System.out
														.println("EL VAMPIRO TE ATACA BRUTALMENTE Y MUERES ASESINADO");
												System.out.println("MIENTRAS TE CHUPA LA SANGRE PIENSAS");
												System.out.println(
														"EL VAMPIRO PRINGAO ACABA CHUPANDOTE TODA LA SANGRE MIENTRAS GRITA `أعطني الصلصة الحمراء´");
												System.out.println("");
												System.out.println("BUENA SUERTE LA PRÓXIMA");

												salida = true;
												salidatotal = true;
											}

										}
										// fallas el ataque
										if (decision.equals("no")) {
											palo = false;
											System.out.println("EL VAMPIRO TE ATACA BRUTALMENTE Y MUERES ASESINADO");
											System.out.println("MIENTRAS TE CHUPA LA SANGRE PIENSAS");
											System.out.println(
													"<si hubiese tenido una estaca o algo afilado me lo podria haber cargado, parece un parguela>");
											System.out.println(
													"PERO EL VAMPIRO PRINGAO ACABA CHUPANDOTE TODA LA SANGRE MIENTRAS GRITA `أعطني الصلصة الحمراء´");
											salida = true;
											salidatotal = true;
										}
									}
									// no puedes atacar al vampiro
								} else {
									System.out.println("EL VAMPIRO TE ATACA BRUTALMENTE Y MUERES ASESINADO");
									System.out.println("MIENTRAS TE CHUPA LA SANGRE PIENSAS");
									System.out.println(
											"<si hubiese tenido una estaca o algo afilado me lo podria haber cargado, parece un parguela>");
									System.out.println(
											"PERO EL VAMPIRO PRINGAO ACABA CHUPANDOTE TODA LA SANGRE MIENTRAS GRITA `أعطني الصلصة الحمراء´ ");
									salida = true;
									salidatotal = true;
								}
							}
						}
						// límite del norte3, sur-3
						if (sur == -3 && norte == 3 && este == 0 && oeste == 0) {
							System.out.println(
									"TE ACABA DE ATACAR UN VAMPIRO , NO CREO QUE IR HACIA SU GUARIDA SEA BUENA IDEA");
							sur = sur + 1;
							norte = norte - 1;

						}
					}
					// caminas hacia el sur
					if (decision.equals("caminar hacia el sur") || decision.equals("ir hacia el sur")
							|| decision.equals("ir al sur")) {
						System.out.println("CAMINAS HACIA EL SUR");
						System.out.println("");
						horario = horario + 1;
						norte = norte - 1;
						sur = sur + 1;

						// sur+1,norte-1
						if (sur == 1 && norte == -1 && este == 0 && oeste == 0) {

							System.out.println("TE TROPIEZAS CON UN PALO, TRAS CAERTE TE DAS CUENTA QUE ESTA AFILADO");
							System.out.println("");
							System.out.println("¿QUIERES COGERLO?");
							System.out.print(">");
							decision = Entrada.cadena().toLowerCase();
							if (decision.equals("si") || decision.equals("no")) {
								error = false;
							} else {
								error = true;
							}
							if (!error) {
								if (decision.equals("si")) {
									palo = true;
									System.out.println("COGES EL PALO");

								}
								if (decision.equals("no")) {
									System.out.println("PASAS DEL PALO");

								}

							}
							while (error) {
								System.out.println("¿QUE HACES CON EL PALO?,¿QUIERES COGERLO?");
								System.out.print(">");
								decision = Entrada.cadena().toLowerCase();
								if (decision.equals("si")) {
									palo = true;
									System.out.println("COGES EL PALO");
									error = false;
								}
								if (decision.equals("no")) {
									System.out.println("PASAS DEL PALO");
									error = false;

								}
							}

							System.out.println("");

						}
					}

					// Caminar hacia el este
					if (decision.equals("caminar hacia el este")
							|| decision.equals("ir hacia el este") | decision.equals("ir al este")) {
						System.out.println("");
						System.out.println("CAMINAS HACIA EL ESTE");
						System.out.println("");
						horario = horario + 1;
						este = este + 1;
						oeste = oeste - 1;
						// Este = 1 , el resto = 0

						if (sur == 0 && norte == 0 && este == 1 && oeste == -1) {
							System.out.println("SE ESCUCHA UN RÍO CERCA");
						}

						// Este = 2 , el resto 0

						if (sur == 0 && norte == 0 && este == 2 && oeste == -2) {
							horario = horario + 1;
							System.out.println("LLEGAS A UN RIO");
							System.out.println("DECIDES AGACHARTE Y LAVARTE LAS MANOS");
							System.out.println("");
							System.out.println("UNA LANGOSTA AZUL SALE DEL AGUA Y GRITA `која будала´ ");
							System.out.println(
									"CLARAMENTE ESTAS CONMOCIONADO PORQUE NO SABIAS QUE LAS LANGOSTAS HABLABAN");
							System.out.println("Y TAMPOCO SABIAS QUE SU IDIOMA ERA EL SERBIO ");
							System.out.println("");
							System.out.println("QUIERES INTERACTUAR CON LA LANGOSTA?");
							System.out.print(">");
							decision = Entrada.cadena().toLowerCase();
							if (decision.equals("si") || decision.equals("no")) {
								error = false;
							} else {
								error = true;
							}
							if (!error) {
								if (decision.equals("si")) {

									System.out.println(
											"<hola , ¿tienes insta? jaja > ESTOY HECHO UN PAYASO , PIENSAS DE TI MISMO");
									System.out.println("");
									System.out.println(
											"LA LANGOSTA SALTA FUERA DEL RIO CON UN DOBRE MORTAL HACIA ATRAS ");
									System.out.println(
											"Y SE SACA UN KARAMBIT DE 30cm UTILIZADO POR LOS SOLDADOS ASIATICOS");
									System.out.println(
											"LA LANGOSTA GRITA `արի տեսնեմ էդ ժամացույցը, ես չեմ գողանում ախպեր´ ");
									System.out
											.println("MIENTRAS TE APUÑALA HASTA LA MUERTE Y TE ROBA TUS PERTENENCIAS");
									System.out.println("");
									salida = true;
									salidatotal = true;

								}
								if (decision.equals("no")) {
									System.out.println("RETROCEDES ATURDIDO POR LO QUE ACABA DE PASAR");
									System.out.println("<¿estoy drogado?> PIENSAS");
									System.out.println("");
									System.out.println("MIENTRAS RETROCEDÍAS , LA LANGOSTA SE SACA UN CUCHILLO");
									System.out.println(
											"PERO COMO TE HABIAS ALEJADO LO SUFICIENTE , PUEDES SALIR CORRIENDO");
									System.out.println("");
									System.out.println("CORRES HACIA EL OESTE");
									este = este - 1;
									oeste = oeste + 1;

								}

							}
							while (error) {
								System.out.println("¿QUIERES INTERACTUAR CON LA LANGOSTA?");
								System.out.print(">");
								decision = Entrada.cadena().toLowerCase();
								if (decision.equals("si")) {
									System.out.println(
											"<hola , ¿tienes insta? jaja > ESTOY HECHO UN PAYASO , PIENSAS DE TI MISMO");
									System.out.println("");
									System.out.println(
											"LA LANGOSTA SALTA FUERA DEL RIO CON UN DOBRE MORTAL HACIA ATRAS ");
									System.out.println(
											"Y SE SACA UN KARAMBIT DE 30cm UTILIZADO POR LOS SOLDADOS ASIATICOS");
									System.out.println(
											"LA LANGOSTA GRITA `արի տեսնեմ էդ ժամացույցը, ես չեմ գողանում ախպեր´ ");
									System.out
											.println("MIENTRAS TE APUÑALA HASTA LA MUERTE Y TE ROBA TUS PERTENENCIAS");
									System.out.println("");
									salida = true;
									salidatotal = true;
									error = false;
								}
								if (decision.equals("no")) {
									System.out.println("RETROCEDES ATURDIDO POR LO QUE ACABA DE PASAR");
									System.out.println("<¿estoy drogado?> PIENSAS");
									System.out.println("");
									System.out.println("MIENTRAS RETROCEDÍAS , LA LANGOSTA SE SACA UN CUCHILLO");
									System.out.println(
											"PERO COMO TE HABIAS ALEJADO LO SUFICIENTE , PUEDES SALIR CORRIENDO");
									System.out.println("");
									System.out.println("CORRES HACIA EL OESTE");
									este = este - 1;
									oeste = oeste + 1;

									error = false;

								}
							}
						}

					}

					// caminar hacia el oeste
					if (decision.equals("caminar hacia el oeste") || decision.equals("ir hacia el oeste")
							|| decision.equals("ir al oeste")) {
						System.out.println("");
						horario++;
						este = este - 1;
						oeste++;
						System.out.println("CAMINAS HACIA EL OESTE");
						if (sur == 0 && norte == 0 && este == -1 && oeste == 1) {
							// cueva
							System.out.println("PARECE QUE HAY UNA ENTRADA A UNA CUEVA");
							System.out.println("¿QUIERES ENTRAR?");
							System.out.print(">");
							decision = Entrada.cadena().toLowerCase();
							if (decision.equals("si") || decision.equals("no")) {
								error = false;
							} else {
								error = true;
							}
							if (!error) {
								if (decision.equals("si")) {
									// entras en la cueva
									System.out.println("ENTRAS EN LA CUEVA , PERO ESTA MUY OSCURO");
									System.out.println("");
									System.out.println(".");
									System.out.println("..");
									System.out.println("...");
									System.out.println("");
									System.out
											.println("NO HAY MUCHO , ES UNA CUEVA NORMAL Y CORIENTE , ¿QUE ESPERABAS?");
									System.out.println("ENCIMA NO VES NADA ");
									// cerilla
									System.out.println("AUNQUE RECUERDAS QUE TIENES UNA CERILLA EN LA MOCHILA");
									System.out.println("¿QUIERES USARLA? ?");
									System.out.print(">");
									decision = Entrada.cadena().toLowerCase();
									if (decision.equals("si") || decision.equals("no")) {
										error = false;
									} else {
										error = true;
									}
									if (!error) {
										// cerilla si
										if (decision.equals("si")) {
											System.out.println("ENCIENDES LA CERILLA");
											System.out.println("");
											System.out.println("LA CUEVA ESTA VACIA ");
											System.out.println("PERO VES UN OBJETO NEGRO A TU DERECHA ");
											System.out.println("QUIERES IR A COGERLO?");
											System.out.print(">");
											// coger linterna
											decision = Entrada.cadena().toLowerCase();
											if (decision.equals("si") || decision.equals("no")) {
												error = false;
											} else {
												error = true;
											}
											if (!error) {
												if (decision.equals("si")) {

												}
												if (decision.equals("no")) {
												}
											}
											while (error) {
												System.out.println("¿QUIERES IR A COGERLO?");
												System.out.print(">");
												decision = Entrada.cadena().toLowerCase();
												if (decision.equals("si")) {
													error = false;
												}
												if (decision.equals("no")) {
													error = false;
												}
											}
										}
										if (decision.equals("no")) {
											// cerilla no
											System.out.println("");
											System.out.println("<nah , me la guardo por si acaso > ");
											;
											System.out.println("");

										}
									}
									while (error) {
										System.out.println("¿QUIERES USARLA?");
										System.out.print(">");
										decision = Entrada.cadena().toLowerCase();
										if (decision.equals("si")) {
											// cerilla si , sales del bucle
											error = false;
										}
										if (decision.equals("no")) {
											// cerilla no , sales del bucle
											System.out.println("");
											System.out.println("<nah , me la guardo por si acaso > ");

											System.out.println("");
											error = false;
										}
									}
								}
								if (decision.equals("no")) {
									// no entras en la cueva
									System.out.println("SALES DE LA CUEVA");
									System.out.println(
											"<seguro que había algun elefante ruso o alguna movida rara de esas> , PIENSAS");
									System.out.println("");
									System.out.println("RETROCEDES HACIA EL ESTE");
									este++;
									oeste--;

								}
							}
							while (error) {
								// entras en la cueva,sales del bucle
								System.out.println("¿QUIERES ENTRAR?");
								System.out.print(">");
								decision = Entrada.cadena().toLowerCase();
								if (decision.equals("si")) {
									error = false;
								}
								if (decision.equals("no")) {
									// sales de la cueva y del bucle
									System.out.println("SALES DE LA CUEVA");
									System.out.println(
											"<seguro que había algun elefante ruso o alguna movida rara de esas> , PIENSAS");
									System.out.println("");
									System.out.println("RETROCEDES HACIA EL ESTE");
									este++;
									oeste--;
									error = false;
								}
							}

						}

					}
					// horario
					if (horario == 1) {
						System.out.println("");
						System.out.println("SE EMPIEZA A HACER DE NOCHE");
						System.out.println("TU MADRE TE ESTA ESPERANDO PARA CENAR LENTEJAS , DATE PRISA");
						System.out.println("");
					}
					if (horario == 4 && linterna == false) {
						System.out.println("YA ES DE NOCHE");
						System.out.println(
								"NO VES NADA , DEBERIAS BUSCAR UNA FUENTE DE LUZ O PODRIAS CHOCARTE CONTRA UN ARBOL");
					}
					if (horario > 4 && linterna == false) {
						Random r = new Random();
						chocar = r.nextInt(20);

						if (chocar == 5) {
							System.out.println("COMO NO VES NADA,TE CHOCAS CONTRA UN ÁRBOL QUEMADO");
							System.out.println("PERO NO UN ÁRBOL CUALQUIERA");
							System.out.println("RESULTA QUE ES ARBOL OBAMA");
							System.out.println("EL ARBOL TE GRITA 'YO BRO , DON´T BOTHER ME' ");
							System.out.println("Y DECIDE TIRARTE UNOS MISILES");
							System.out.println("CLARAMENTE SABÍAS QUE ESO IBA A PASAR");
							salida = true;
							salidatotal = true;
						}
					}
					// error
				} else {
					System.out.println("ERROR,ESCRIBA BIEN SU INSTRUCCION");
					System.out.println("");
					error = false;
					salida = true;
				}
			}

		} while (!salidatotal);
		System.out.println("");
		System.out.println("GRACIAS POR JUGAR");
	}

}