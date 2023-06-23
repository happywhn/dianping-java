package edu.whn.dianping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whn.dianping.dto.Result;
import edu.whn.dianping.entity.Follow;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);
}
