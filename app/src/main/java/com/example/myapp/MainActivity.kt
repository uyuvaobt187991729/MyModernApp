package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
	    override fun onCreate(savedInstanceState: Bundle?) {
	    	        super.onCreate(savedInstanceState)
	    	                setContent {
	    	                	            Greeting("Android 14 Developer")
	    	                	                    }
	    	                	                        }
	    	                	                        }

	    	                	                        @Composable
	    	                	                        fun Greeting(name: String) {
	    	                	                        	    Text(text = "Hello $name! This app was coded on Termux.")
	    	                	                        	    }
	    	                	                        }
	    	                }
	    }
}
