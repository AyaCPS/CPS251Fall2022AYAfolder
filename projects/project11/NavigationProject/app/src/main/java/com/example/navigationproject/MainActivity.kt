

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationproject.ui.main.MainFragment

import android.net.Uri
import com.example.navigationproject.R
import com.example.navigationproject.SecondFragment

class MainActivity : AppCompatActivity(), SecondFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onFragmentInteraction(uri:Uri) {

    }
}