package com.example.rvlopez.multilogin.helpers;

import com.example.rvlopez.multilogin.models.LoginOptionModel;
import com.example.rvlopez.multilogin.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    public static List<LoginOptionModel> getLoginOptionsList() {
        List<LoginOptionModel> loginOptionModelList = new ArrayList<>();

        for (int i = 0; i < Constants.SOCIAL_ICON_ID_LIST.length; i++) {
            LoginOptionModel loginOptionModel = new LoginOptionModel();
            loginOptionModel.setIconId(Constants.SOCIAL_ICON_ID_LIST[i]);
            loginOptionModel.setLoginOption(Constants.SOCIAL_TITLE_LIST[i]);
            loginOptionModelList.add(loginOptionModel);
        }

        return loginOptionModelList;
    }
}
