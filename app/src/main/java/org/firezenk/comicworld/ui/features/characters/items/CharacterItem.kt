package org.firezenk.comicworld.ui.features.characters.items

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import kotlinx.android.synthetic.main.screen_characters_item.view.*
import org.firezenk.comicworld.R
import org.firezenk.comicworld.domain.models.CharacterModel

class CharacterItem constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : ConstraintLayout(context, attrs, defStyleAttr) {

    private lateinit var model: CharacterModel

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        inflate(context, R.layout.screen_characters_item, this)

        name.text = model.name
    }

    fun bind(model: CharacterModel) {
        this.model = model
    }
}