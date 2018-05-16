package utils;

import java.util.ArrayList;
import java.util.List;

import model.ComponentModel;

public class ComponentsUtils {

    private List<ComponentModel> componentsList = new ArrayList<>();
    private String[] names = {"alext_box","call_us","custom_alert_dialog","danger_box",
            "dialog_input_box","divider_default","empty_state","overlay","parking_info",
            "disclaimer","info","input_with_tag","list_option","payment_button","row",
            "row_value","selector_button","stepper","succes","unsuccess","waiting","zone_status"};


    public ComponentsUtils(){

        fillComponentList();
    }

    public void fillComponentList() {
        for (int i = 0; i < names.length; i++) {
            ComponentModel componentModel = new ComponentModel(names[i]);
            componentsList.add(componentModel);
        }
    }

    public List<ComponentModel> getComponentsList() {
        return componentsList;
    }
}