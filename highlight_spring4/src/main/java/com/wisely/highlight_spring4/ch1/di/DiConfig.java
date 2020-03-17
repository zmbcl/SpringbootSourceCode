package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * @description: component |kəmˈpəʊnənt| 零件组分；repository |rəˈpɑzəˌtɔri |存放处，信息库；inject |ɪnˈdʒɛkt| 注射，注入，引入；
 * @author: bcl
 * @date: 2020/3/17 8:19 下午
 * @param: 
 * @return: 
 */

@Configuration //声明当前类是一个配置类
@ComponentScan("com.wisely.highlight_spring4.ch1.di") //自动扫描包名下所有@Service，@Component，@Repositoty，@Controller
public class DiConfig {

}
