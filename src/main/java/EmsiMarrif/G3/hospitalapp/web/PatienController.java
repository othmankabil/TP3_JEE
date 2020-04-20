package EmsiMarrif.G3.hospitalapp.web;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import EmsiMarrif.G3.hospitalapp.dao.PatienRepository;
import EmsiMarrif.G3.hospitalapp.entities.*;
import antlr.collections.List;

@Controller
public class PatienController {
	@Autowired
	private PatienRepository patientRep;
	@GetMapping(path = "/index")
	public String index()
	{
		return "index";
	}
	@GetMapping(path = "/patientView")
	public String patienView(Model model, @RequestParam(name="page",defaultValue = "0") int p
			,@RequestParam(name="size",defaultValue = "1")	int size)
	{
		Page<patient> patients = this.patientRep.findAll(PageRequest.of(p,size));
		model.addAttribute("patients",patients.getContent());
		model.addAttribute("pages",new int[patients.getTotalPages()]);
		return "patientView";
	}
}
