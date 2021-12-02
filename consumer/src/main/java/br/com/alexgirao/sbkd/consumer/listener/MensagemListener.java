package br.com.alexgirao.sbkd.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MensagemListener {
	
	private final Logger logger = LoggerFactory.getLogger(MensagemListener.class);

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void consume(String message) throws IOException {
    	logger.info(String.format("Consumindo mensagem: %s", message));
    }

}
