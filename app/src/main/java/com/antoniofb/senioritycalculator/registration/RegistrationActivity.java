package com.antoniofb.senioritycalculator.registration;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.antoniofb.senioritycalculator.R;
import com.antoniofb.senioritycalculator.factors.FactorsActivity;

public class RegistrationActivity extends AppCompatActivity {

    private EditText etEmployeeName, etEmployeeJob, etEmployeeSeniority;
    private Button btRegisterEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setActionBarTitle();
        init();
    }

    public void setActionBarTitle(){
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Registration Screen");
    }

    private void init(){
        btRegisterEmployee = (Button) findViewById(R.id.btnRegisterEmployee);
        btRegisterEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerEmployee();
            }
        });
    }

    public void registerEmployee(){
        etEmployeeName = (EditText) findViewById(R.id.employeeName);
        etEmployeeJob = (EditText) findViewById(R.id.employeeJob);
        etEmployeeSeniority = (EditText) findViewById(R.id.employeeSeniority);
        String employeeName, employeeJob, employeeSeniority;
        if (isFormValidated()){
            Intent i = new Intent(this,FactorsActivity.class);
            employeeName = etEmployeeName.getText().toString();
            employeeJob = etEmployeeJob.getText().toString();
            employeeSeniority = etEmployeeSeniority.getText().toString();
            i.putExtra("Name", employeeName);
            i.putExtra("Job", employeeJob);
            i.putExtra("Seniority", employeeSeniority);
            startActivity(i);
            //startActivity(new Intent(RegistrationActivity.this, FactorsActivity.class));
            Toast.makeText(RegistrationActivity.this,"Registration correct",Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isFormValidated(){
        if (!isEmployeeNameValid()){
            Toast.makeText(this,"Invalid employee name", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!isEmployeeJobValid()){
            Toast.makeText(this,"Invalid employee job", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!isEmployeeSeniorityValid()){
            Toast.makeText(this,"Invalid employee seniority", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private boolean isEmployeeNameValid(){
        return !TextUtils.isEmpty(etEmployeeName.getText()); //|| !Patterns.PHONE.matcher(etEmployeeName.getText()).matches();
    }

    private boolean isEmployeeJobValid(){
        return !TextUtils.isEmpty(etEmployeeJob.getText());
    }

    private boolean isEmployeeSeniorityValid(){
        return !TextUtils.isEmpty(etEmployeeSeniority.getText());
    }
}
