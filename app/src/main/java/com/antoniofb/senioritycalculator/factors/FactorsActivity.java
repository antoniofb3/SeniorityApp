package com.antoniofb.senioritycalculator.factors;

import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.antoniofb.senioritycalculator.R;

public class FactorsActivity extends AppCompatActivity implements FactorsListFragment.OnFragmentInteractionListener {

    private TextView tvEmpData;
    private String[] selectedOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factors);
        setActionBarTitle();
        showEmployeeData();
    }

    public void setActionBarTitle(){
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Factors Screen");
    }

    public void showEmployeeData(){
        Bundle bundle = getIntent().getExtras();
        String[] empData = {bundle.getString("Name"), bundle.getString("Job"), bundle.getString("Seniority")};
        tvEmpData = (TextView) findViewById(R.id.tvEmployeeName);
        tvEmpData.setText(empData[0]);
        tvEmpData = (TextView) findViewById(R.id.tvEmployeeJob);
        tvEmpData.setText(empData[1]);
        tvEmpData = (TextView) findViewById(R.id.tvEmployeeSeniority);
        tvEmpData.setText(empData[2]);
    }

    @Override
    public void onFragmentInteraction(String itemSelected) {
        Log.d("TAG", "Factors List Activity Log ->>>> Item: " + itemSelected + " selected");
    }
}
