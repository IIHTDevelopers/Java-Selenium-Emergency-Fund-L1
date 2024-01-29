package com.iiht.evaluation.automation;

import java.util.HashMap;
import java.util.Map;

public class locators {
    public static final Map<String, String> money_control_element = new HashMap<>();

    static {
        

        money_control_element.put("main_menu", "");
        money_control_element.put("sub_menu", "");

        

        money_control_element.put("medical_dental_cost_input", "");
        money_control_element.put("vehicle_repair_input", "");
        money_control_element.put("others_input", "");
        money_control_element.put("life_health_insurance_premium_input", "");
        money_control_element.put("home_auto_insurance_premium_input", "");
        money_control_element.put("home_loan_other_important_emis_input", "");
        money_control_element.put("monthly_living_expenses_input", "");
        money_control_element.put("month_unemployed_input", "");
        money_control_element.put("calculate_button", "");
        money_control_element.put("emergency_fund_calculator_result_div", "");
        money_control_element.put("uninsured_unexpected_emergencies_total_div", "");
        money_control_element.put("annual_amount_of_fixed_payments_total_div", "");
        money_control_element.put("build_reserve_to_pay_for_job_loss_div", "");

        
    }
}
