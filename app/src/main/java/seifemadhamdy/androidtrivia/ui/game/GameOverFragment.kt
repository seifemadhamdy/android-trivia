package seifemadhamdy.androidtrivia.ui.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import seifemadhamdy.androidtrivia.R
import seifemadhamdy.androidtrivia.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    private lateinit var binding: FragmentGameOverBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_over, container, false
        )

        binding.retryMaterialButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                GameOverFragmentDirections.actionGameOverFragmentToGameFragment()
            )
        )

        return binding.root
    }
}
