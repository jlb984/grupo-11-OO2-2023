package converters;

import org.springframework.stereotype.Component;

import com.grupo11.grupo11OO22023.entities.RiegoAutomatico;
import com.grupo11.grupo11OO22023.models.RiegoAutomaticoModel;

@Component("riegoAutomaticoConverter")
public class RiegoAutomaticoConverter {

	
	
	
	public RiegoAutomaticoModel entityToModel(RiegoAutomatico riego) {
		
		return new RiegoAutomaticoModel(riego.getIdDispositivo(), riego.getNombre(),riego.getLugar(),riego.isEstaActivo(),riego.getDescripcion()
				,riego.getNivelHumedad(),riego.getTemperatura(),riego.getNivelUV());
	}
}
