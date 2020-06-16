package com.example.picass

import java.io.Serializable

class ItemOfList(val imageURL : String) : Serializable {
    companion object{
        fun getAndroidVersionList(): List<ItemOfList>{
            val versionList = ArrayList<ItemOfList>()
            versionList.clear()
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/kitkat.png"))
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/Ice-Cream-Sandwitch.png"))
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/gingerbread.png"))
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/oreo.png"))
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/eclair.png"))

            return versionList
        }
    }
}
