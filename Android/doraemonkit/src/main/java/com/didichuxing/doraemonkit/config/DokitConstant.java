package com.didichuxing.doraemonkit.config;

import android.util.SparseArray;

import com.didichuxing.doraemonkit.kit.IKit;
import com.didichuxing.doraemonkit.ui.kit.KitItem;

import java.util.ArrayList;
import java.util.List;

/**
 * ================================================
 * 作    者：jint（金台）
 * 版    本：1.0
 * 创建日期：2019-12-19-10:21
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class DokitConstant {
    /**
     * 是否是普通的浮标模式
     */
    public static boolean IS_NORMAL_FLOAT_MODE = true;


    public static String PRODUCT_ID = "";

    public static SparseArray<List<IKit>> KIT_MAPS = new SparseArray<>();

    public static List<IKit> getKitList(int catgory) {
        if (KIT_MAPS.get(catgory) != null) {
            return new ArrayList<>(KIT_MAPS.get(catgory));
        } else {
            return null;
        }
    }

    /**
     * 将指定类目的kits转为指定的KitItems
     *
     * @param catgory
     * @return
     */
    public static List<KitItem> getKitItems(int catgory) {
        if (KIT_MAPS.get(catgory) != null) {
            List<KitItem> kitItems = new ArrayList<>();
            for (IKit kit : KIT_MAPS.get(catgory)) {
                kitItems.add(new KitItem(kit));
            }
            return kitItems;
        } else {
            return null;
        }
    }
}
