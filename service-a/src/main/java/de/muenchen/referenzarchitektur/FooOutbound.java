/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muenchen.referenzarchitektur;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 *
 * @author robert.jasny
 */
public interface FooOutbound {

    public final String FOO_OUTPUT = "fooEvent";

    @Output(FOO_OUTPUT)
    MessageChannel fooEvent();

}
