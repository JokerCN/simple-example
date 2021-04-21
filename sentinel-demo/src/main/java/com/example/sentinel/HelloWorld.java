package com.example.sentinel;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.google.common.collect.Lists;

import java.util.List;

public class HelloWorld {

    private static void initFlowRules(){
        List<FlowRule> rules = Lists.newArrayList();
        FlowRule rule = new FlowRule();
        rule.setResource("HelloWorld");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(20);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }

    public static void main(String[] args) {
        initFlowRules();

        while (true){
            try(Entry entry = SphU.entry("HelloWorld")) {
                System.out.println("hello world");
            } catch (BlockException ex){
                System.out.println("blocked!");
            }
        }
    }
}
