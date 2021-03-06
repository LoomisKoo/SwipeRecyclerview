package androidx.recyclerview.widget;

/**
 * Created by Yan Zhenjie on 2016/8/1.
 */
public class MyCompatItemTouchHelper extends ItemTouchHelper {

    public MyCompatItemTouchHelper(ItemTouchHelper.Callback callback) {
        super(callback);
    }

    /**
     * Developer callback which controls the behavior of ItemTouchHelper.
     *
     * @return {@link Callback}
     */
    public ItemTouchHelper.Callback getCallback() {
        return mCallback;
    }
}
