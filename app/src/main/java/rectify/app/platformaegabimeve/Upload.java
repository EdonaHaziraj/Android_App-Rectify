package rectify.app.platformaegabimeve;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mReportCategory;
    private String mKey;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String name, String imageUrl, String kategoria) {
        if (name.trim().equals("")) {
            name = "Raportim pa përshkrim";
        }

        mName = name;
        mImageUrl = imageUrl;
        mReportCategory = kategoria;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }


    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }


    public String getSpinner() {
        return mReportCategory;
    }

    public void setSpinner(String kategoria) {
        mReportCategory = kategoria;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}