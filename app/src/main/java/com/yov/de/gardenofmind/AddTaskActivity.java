package com.yov.de.gardenofmind;
/*
* Copyright (C) 2016 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.yov.de.gardenofmind.data.TaskContract;


public class AddTaskActivity extends AppCompatActivity {

    // Declare a member variable to keep track of a task's selected mPriority
    private int mPriority;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

    }
    public void onClickAddTask(View view) {
        String input = ((EditText) findViewById(R.id.editTextTaskDescription)).getText().toString();
        String word = ((EditText) findViewById(R.id.editTextTaskWord)).getText().toString();
        if (input.length() == 0) {
            return;
        }

        ContentValues contentValues = new ContentValues();
        contentValues.put(TaskContract.TaskEntry.COLUMN_WORD, word);
        contentValues.put(TaskContract.TaskEntry.COLUMN_DESCRIPTION, input);
        Uri uri = getContentResolver().insert(TaskContract.TaskEntry.CONTENT_URI, contentValues);

         if(uri != null) {
           // Toast.makeText(getBaseContext(), uri.toString(), Toast.LENGTH_LONG).show();
        }
         finish();

    }

}
