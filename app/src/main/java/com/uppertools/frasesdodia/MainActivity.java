package com.uppertools.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase (View view) {
        String[] frases = {
                "Nós temos de nos forçar a aprender o tempo todo. Temos dois ouvidos e uma boca, para ouvirmos mais do que falamos. Não se aprende sem ouvir. - Sônia Hess",
                "A causa da derrota, não está nos obstáculos, ou no rigor das circunstâncias, está na falta de determinação e desistência da própria pessoa. - Buda",
                "Mudar é difícil mas é possível. - Paulo Freire",
                "Se não houver felicidade, negócio vira uma tortura. - Robinson Shiba",
                "Não tenha receio de desistir do bom para correr atrás do ótimo - John D. Rockefeller",
                "Sucesso? Eu não sei o que exatamente isso significa. Eu sou feliz. A definição de sucesso varia de pessoa para pessoa. Para mim, o sucesso é ter paz interior - Denzel Washington",
                "Seja muito bom, que eles não vão ter como ignorar você - Steve Martin",
                "Não sei qual é o segredo do sucesso, mas o segredo do fracasso é tentar agradar a todo mundo - Bill Cosby",
                "Daqui a vinte anos, você não vai se arrepender das coisas que fez, mas das que deixou de fazer. Por isso, veleje longe do seu porto seguro. Pegue os ventos. Explore. Sonhe. Descubra - Mark Twain",
                "Para ser bem sucedido, o desejo pelo sucesso deve ser maior que o medo de falhar - Bill Cosbya",
                "Eu acredito demais na sorte. E tenho constatado que, quanto mais duro eu trabalho, mais sorte eu tenho. - Coleman Cox",
                "O sucesso não consiste em não errar, mas em não cometer os mesmos equívocos mais de uma vez - George Bernard Shaw",
                "Você precisa trazer para o mundo algo que não estava nele antes. Não importa o que é, todas as pessoas deveriam criar. Você precisa fazer algo e poder sentar e dizer: 'Eu fiz isso'. - Ricky Gervais",
                "A maior recompensa para o trabalho do homem não é o que ele ganha com isso, mas o que ele se torna com isso. - John Ruskin",
                "Inspiração vem dos outros. Motivação vem de dentro de nós. - Desconhecido",
                "A maior glória não é ficar de pé, mas levantar-se cada vez que se cai. - Confúcio",
                "O mais importante ingrediente na fórmula do sucesso é saber como lidar com as pessoas. - Theodore Roosevelt",
                "A esperança morre no primeiro insucesso; a ambição sobrevive à última derrota - Walther Waeny",
                "Identifique seus problemas, mas dê seu poder e energia a soluções. - Tony Robbins",
                "A lógica pode levar de um ponto A a um ponto B. A imaginação pode levar a qualquer lugar - Albert Einstein",
                "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente. - Zig Ziglar",
                "Nossa maior fraqueza está em desistir. A maneira certa de ter sucesso é tentar apenas mais uma vez. - Thomas Edison",
                "Habilidade é o que você é capaz de fazer. Motivação determina o que você faz. Atitude determina o quão bem você faz. - Lou Holtz",
                "As pessoas alcançam sucesso quando eles percebem que seus fracassos são uma preparação para suas vitórias. - Ralph Waldo Emerson",
                "Não se preocupe com falhas, preocupe-se com as chances que você perde quando não tenta. - Jack Canfield",
                "Não lute apenas para ter grandes clientes. Trabalhe para conquistar bons e fiéis amigos. - Fernando Guifer",
                "Ganhamos força, coragem e confiança a cada experiência em que verdadeiramente paramos para enfrentar o medo - Eleanor Roosevelt",
                "Torne-se a pessoa que atrairia os resultados que você procura. - Jim Cathcart",
                "Andar para trás só se for para pegar impulso. - Abel Bonnard",
                "Sucesso não é quanto dinheiro você ganha, mas a diferença que você faz na vida das pessoas. - Michelle Obama",
                "Diga ‘obrigado’ a todos que você encontrar e para tudo o que eles fazem por você. - Brian Tracy",
                "Uma porta pode se fechar, mas nunca será o final! Acredite, lute, trabalhe, pois esta porta será aberta. - Rogério Mendes Pereira Júnior",
                "A recompensa que se ganha da realização de um trabalho são as experiências e os conhecimentos que adquirimos e a sensação de ter contribuído para alguma mudança. - Sânia T. Costa",
                "O pensamento positivo pode vir naturalmente para alguns, mas também pode ser aprendido e cultivado. Mude os seus pensamentos e mudará o seu mundo! - Norman Vicent Peale",
                "Não há nenhum segredo para o sucesso. É o resultado de preparação, trabalho duro, e aprender com o fracasso - Gen. Colin L. Powell",
                "A conquista tem de ser trabalhosa para haver uma vitória! O amor nao cai de pára-quedas! - Paulo Marcus",
                "Lute com determinação, abrace a vida com paixão, perca com classe e vença com ousadia, porque o mundo pertence a quem se atreve e a vida é muito bela para ser insignificante. - Charles Chaplin",
                "O fracasso é apenas uma oportunidade para recomeçar com mais inteligência. - Henry Ford",
                "Diante de uma dificuldade substitua o eu não consigo pelo vou tentar outra vez. - Autor Desconhecido",
                "O bom humor espalha mais felicidade que todas as riquezas do mundo. Vem do hábito de olhar para as coisas com esperança e de esperar o melhor e não o pior. - Alfred Montapert",
                "O maior risco é não assumir riscos… em um mundo que está mudando realmente rápido, a única estratégia que é garantia de falha é não assumir riscos. - Mark Zuckerberg",
                "Sonhe como se você fosse viver para sempre. Viva como se você fosse morrer hoje. - James Dean",
                "Se sonhar grande dá o mesmo trabalho de sonhar pequeno, porque vou sonhar pequeno? - Jorge Paulo Lemann",
                "A melhor época para plantar uma árvore foi há 20 anos. A segunda melhor é agora. - Provérbio Chinês",
                "O homem não teria alcançado o possível se, repetidas vezes, não tivesse tentado o impossível. - Max Weber",
                "Não deixe que as pessoas te façam desistir daquilo que você mais quer na vida. Acredite. Lute. Conquiste. E acima de tudo, seja feliz! - Autor Desconhecido",
                "Quando você quer alguma coisa, todo o universo conspira para que você realize o seu desejo. - Paulo Coelho",
                "O sucesso tem uma estranha capacidade de esconder o erro. - Salústio",
                "Divide as dificuldades que tenhas de examinar em tantas partes quantas for possível, para uma melhor solução. - René Descartes",
                "Nossa força maior não está na capacidade de pensar, mas em algo mais poderoso: o poder de controlar e direcionar nossos pensamentos para onde quisermos. - Napoleon Hill"
        };

        int numero = new Random().nextInt(frases.length);
        TextView texto = (TextView) findViewById(R.id.txtMotivarSe);
        texto.setText(frases[numero]);
    }

}
