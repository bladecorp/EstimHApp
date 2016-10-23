package com.sysdt.estimuladorapp.util;

import com.sysdt.estimuladorapp.enums.RespuestaWS;


public class MensajesUtil {
	
	public static String mostrarError(int tipo, String tipoUs){
		if(tipo == RespuestaWS.EXCEPCION.getId()){
			return "Ocurrio una excepcion en el web service";
		}
		if(tipo == RespuestaWS.INFO_INCOMPLETA.getId()){
			return "La informacion llego incompleta al web service";
		}
		if(tipo == RespuestaWS.NO_SE_ENCONTRO_REG.getId()){
			return "No se encontro registro del "+tipoUs;
		}
		if(tipo == RespuestaWS.NOMBRE_DUPLICADO.getId()){
			return "El nombre del "+tipoUs+" ya esta registrado";
		}
		if(tipo == RespuestaWS.USUARIO_DUPLICADO.getId()){
			return "El nombre de usuario ya esta registrado";
		}
		if(tipo == RespuestaWS.IMPOSIBLE_ELIMINAR_PACIENTE.getId()){
			return "No se pueden eliminar pacientes";
		}
		if(tipo == RespuestaWS.PASSWORD_INCORRECTO.getId()){
			return "El password es incorrecto";
		}
		if(tipo == RespuestaWS.ESTIMULADOR_DUPLICADO.getId()){
			return "El numero de serie ya esta registrado";
		}
		if(tipo == RespuestaWS.ERROR_AL_ENVIAR_ESTIMULACION.getId()){
			return "Error al enviar la estimulacion";
		}
		if(tipo == RespuestaWS.CUENTA_DESHABILITADA.getId()){
			return "La cuenta esta deshabilitada";
		}
		if(tipo == RespuestaWS.PAX_YA_ASOCIADO_A_ESTIMULADOR.getId()){
			return "El paciente ya tiene un estimulador vinculado";
		}
		return "";
	}

}
