package com.ldgen.ldgenaimaster.service;

import com.ldgen.ldgenaimaster.model.dto.app.AppQueryRequest;
import com.ldgen.ldgenaimaster.model.vo.app.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.ldgen.ldgenaimaster.model.entity.App;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/ldgen404/">程序员李大根</a>
 */
public interface AppService extends IService<App> {

    /**
     *
     * @param app
     * @return
     */
    AppVO getAppVO(App app);


    /**
     *
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);
}
